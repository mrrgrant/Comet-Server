package com.cometproject.game.rooms.types.entities.base;

import com.cometproject.api.game.rooms.RoomContext;
import com.cometproject.api.game.rooms.entities.EntityPosition;
import com.cometproject.api.game.rooms.entities.IRoomEntity;
import com.cometproject.api.game.rooms.entities.RoomEntityStatus;
import com.cometproject.api.game.utilities.Position;
import com.cometproject.game.rooms.types.attributes.AttributableRoomObject;
import com.google.common.collect.Maps;

import java.util.Map;

public abstract class RoomEntity extends AttributableRoomObject implements IRoomEntity {

    private final RoomContext roomContext;
    private final int entityId;
    protected final EntityPosition entityPosition;

    private boolean updateQueued = false;
    private final Map<RoomEntityStatus, String> statuses;

    public RoomEntity(RoomContext roomContext, int entityId, EntityPosition entityPosition) {
        super(entityId, entityPosition.getRoomPosition(), roomContext);

        this.roomContext = roomContext;
        this.entityId = entityId;
        this.entityPosition = entityPosition;

        this.statuses = Maps.newConcurrentMap();
    }

    @Override
    public int getObjectId() {
        return this.entityId;
    }

    @Override
    public Position getPosition() {
        return this.entityPosition.getRoomPosition();
    }

    @Override
    public Map<RoomEntityStatus, String> getStatuses() {
        return this.statuses;
    }

    @Override
    public void addStatus(RoomEntityStatus key, String value) {
        if (this.statuses.containsKey(key)) {
            this.statuses.replace(key, value);
        } else {
            this.statuses.put(key, value);
        }
    }

    @Override
    public void removeStatus(RoomEntityStatus status) {
        if (!this.statuses.containsKey(status)) {
            return;
        }

        this.statuses.remove(status);
    }

    @Override
    public boolean hasStatus(RoomEntityStatus key) {
        return this.statuses.containsKey(key);
    }

    @Override
    public void enqueueUpdate() {
        this.updateQueued = true;
    }

    @Override
    public boolean hasQueuedUpdate() {
        return this.updateQueued;
    }

    @Override
    public RoomContext getContext() {
        return this.roomContext;
    }
}
