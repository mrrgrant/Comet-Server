package com.cometproject.game.rooms.types.entities;

import com.cometproject.api.game.rooms.RoomContext;
import com.cometproject.api.game.rooms.entities.EntityPosition;
import com.cometproject.api.game.rooms.entities.IRoomEntity;
import com.cometproject.api.game.utilities.Position;

public abstract class RoomEntity implements IRoomEntity {

    private final RoomContext roomContext;
    private final int entityId;
    protected final EntityPosition entityPosition;

    public RoomEntity(RoomContext roomContext, int entityId, EntityPosition entityPosition) {
        this.roomContext = roomContext;
        this.entityId = entityId;
        this.entityPosition = entityPosition;
    }

    @Override
    public int getId() {
        return this.entityId;
    }

    @Override
    public Position getPosition() {
        return this.entityPosition.getRoomPosition();
    }

    @Override
    public int getHeadRotation() {
        return this.entityPosition.getHeadRotation();
    }

    @Override
    public int getBodyRotation() {
        return this.entityPosition.getBodyRotation();
    }

    @Override
    public RoomContext getContext() {
        return this.roomContext;
    }
}
