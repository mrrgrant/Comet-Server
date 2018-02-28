package com.cometproject.game.rooms.types.components;

import com.cometproject.api.game.rooms.RoomContext;
import com.cometproject.api.game.rooms.components.ITileComponent;

public class TileComponent implements ITileComponent {

    private final RoomContext roomContext;

    public TileComponent(RoomContext roomContext) {
        this.roomContext = roomContext;
    }

    @Override
    public RoomContext getContext() {
        return this.roomContext;
    }
}
