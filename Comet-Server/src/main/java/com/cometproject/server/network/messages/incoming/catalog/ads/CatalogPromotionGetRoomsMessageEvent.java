package com.cometproject.server.network.messages.incoming.catalog.ads;

import com.cometproject.server.game.rooms.RoomManager;
import com.cometproject.server.game.rooms.types.RoomDataInstance;
import com.cometproject.server.network.messages.incoming.Event;
import com.cometproject.server.network.messages.outgoing.catalog.ads.CatalogPromotionGetRoomsMessageComposer;
import com.cometproject.server.network.messages.types.MessageEvent;
import com.cometproject.server.network.sessions.Session;
import com.google.common.collect.Lists;

import java.util.List;


public class CatalogPromotionGetRoomsMessageEvent implements Event {
    @Override
    public void handle(Session client, MessageEvent msg) throws Exception {
        List<RoomDataInstance> roomDataList = Lists.newArrayList();

        for (Integer roomId : client.getPlayer().getRooms()) {
            RoomDataInstance data = RoomManager.getInstance().getRoomData(roomId);

            if (data != null && data.getAccess().toLowerCase().equals("open")) {
                roomDataList.add(data);
            }
        }

        client.send(new CatalogPromotionGetRoomsMessageComposer(roomDataList));
    }
}