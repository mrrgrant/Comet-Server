package com.cometproject.game.rooms.types.components;

import com.cometproject.api.game.rooms.RoomContext;
import com.cometproject.api.game.rooms.components.IProcessComponent;

public class ProcessComponent implements IProcessComponent {

    private final RoomContext roomContext;

    public ProcessComponent(RoomContext roomContext) {
        this.roomContext = roomContext;
    }

    @Override
    public RoomContext getContext() {
        return this.roomContext;
    }
}
