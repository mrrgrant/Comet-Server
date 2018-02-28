package com.cometproject.game.rooms.types.components;

import com.cometproject.api.game.rooms.RoomContext;
import com.cometproject.api.game.rooms.components.IFilterComponent;

public class FilterComponent implements IFilterComponent {
    private final RoomContext roomContext;

    public FilterComponent(RoomContext roomContext) {
        this.roomContext = roomContext;
    }

    @Override
    public RoomContext getContext() {
        return this.roomContext;
    }
}
