package com.cometproject.game.rooms.types.components;

import com.cometproject.api.game.rooms.RoomContext;
import com.cometproject.api.game.rooms.components.IEntityComponent;
import com.cometproject.api.game.rooms.entities.RoomEntity;
import com.google.common.collect.Maps;

import java.util.Map;

public class EntityComponent implements IEntityComponent {
    private final RoomContext roomContext;

    private final Map<Integer, RoomEntity> roomEntities;

    public EntityComponent(RoomContext roomContext) {
        this.roomContext = roomContext;
        this.roomEntities = Maps.newConcurrentMap();
    }

    @Override
    public RoomContext getContext() {
        return this.roomContext;
    }
}
