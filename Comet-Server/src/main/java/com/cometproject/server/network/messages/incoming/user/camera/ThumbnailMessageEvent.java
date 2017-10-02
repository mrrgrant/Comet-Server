package com.cometproject.server.network.messages.incoming.user.camera;

import com.cometproject.server.api.ApiClient;
import com.cometproject.server.boot.Comet;
import com.cometproject.server.game.rooms.types.RoomData;
import com.cometproject.server.network.messages.incoming.Event;
import com.cometproject.server.network.messages.outgoing.room.engine.RoomDataMessageComposer;
import com.cometproject.server.network.messages.outgoing.room.settings.ThumbnailTakenMessageComposer;
import com.cometproject.server.network.sessions.Session;
import com.cometproject.server.protocol.messages.MessageEvent;

import java.io.FileOutputStream;
import java.util.UUID;

public class ThumbnailMessageEvent implements Event {
    @Override
    public void handle(Session client, MessageEvent msg) throws Exception {
        final int length = msg.readInt(); // client sends [length:4][header:2][imageSize:4][payload:imageSize]
        final byte[] payload = msg.readBytes(length);

        final UUID imageId = UUID.randomUUID();
        final RoomData roomData = client.getPlayer().getEntity().getRoom().getData();

        final String response = ApiClient.getInstance().saveThumbnail(payload, roomData.getId());

        if (response.isEmpty()) {
            // Failed, send feedback to client
            return;
        }

        roomData.setThumbnail("navigator-thumbnail/" + roomData.getId() + ".png");
        roomData.save();
//
        // Save image URL in database
//        client.getPlayer().sendMotd(imageId.toString());
        client.send(new RoomDataMessageComposer(client.getPlayer().getEntity().getRoom()));
        client.send(new ThumbnailTakenMessageComposer());
    }
}
