package com.cometproject.game.rooms.types.components;

import com.cometproject.api.game.rooms.IRoomComponent;
import com.cometproject.api.game.rooms.RoomContext;
import com.cometproject.api.game.rooms.components.IGameComponent;

public class GameComponent implements IGameComponent {
    private final RoomContext roomContext;

    public GameComponent(RoomContext roomContext) {
        this.roomContext = roomContext;
    }

    @Override
    public RoomContext getContext() {
        return this.roomContext;
    }
}
