package com.cometproject.api.game.rooms.components;

import com.cometproject.api.game.rooms.IRoomComponent;
import com.cometproject.api.networking.messages.IMessageComposer;

public interface IEntityComponent extends IRoomComponent {

    void broadcast(IMessageComposer messageComposer);

}
