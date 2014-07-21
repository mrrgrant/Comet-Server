package com.cometproject.server.network.messages.incoming.catalog.groups;

import com.cometproject.server.game.rooms.types.Room;
import com.cometproject.server.network.messages.incoming.IEvent;
import com.cometproject.server.network.messages.outgoing.catalog.groups.GroupElementsMessageComposer;
import com.cometproject.server.network.messages.outgoing.catalog.groups.GroupPartsMessageComposer;
import com.cometproject.server.network.messages.types.Event;
import com.cometproject.server.network.sessions.Session;
import javolution.util.FastMap;

public class BuyGroupDialogMessageEvent implements IEvent {
    public void handle(Session client, Event msg) {
        client.send(GroupPartsMessageComposer.compose(client.getPlayer().getRooms()));
        client.send(GroupElementsMessageComposer.compose());
    }
}
