package com.cometproject.server.network.messages.incoming.group.settings;

import com.cometproject.server.composers.group.ManageGroupMessageComposer;
import com.cometproject.server.game.groups.GroupManager;
import com.cometproject.server.game.groups.types.Group;
import com.cometproject.server.network.messages.incoming.Event;
import com.cometproject.server.composers.catalog.groups.GroupElementsMessageComposer;
import com.cometproject.server.protocol.messages.MessageEvent;
import com.cometproject.server.network.sessions.Session;


public class ManageGroupMessageEvent implements Event {
    @Override
    public void handle(Session client, MessageEvent msg) throws Exception {
        int groupId = msg.readInt();

        Group group = GroupManager.getInstance().get(groupId);

        if (group == null || client.getPlayer().getId() != group.getData().getOwnerId())
            return;

        client.send(new GroupElementsMessageComposer(GroupManager.getInstance().getGroupItems())); // TODO: Send this once
        client.send(new ManageGroupMessageComposer(group));
    }
}
