package com.cometproject.game.rooms.types.objects;

import com.cometproject.api.game.rooms.RoomContext;
import com.cometproject.api.game.rooms.objects.IRoomObject;
import com.cometproject.api.game.utilities.Position;

public abstract class RoomObject implements IRoomObject {

    private final int objectId;
    private final Position position;
    private final RoomContext roomContext;

    public RoomObject(final int objectId, Position position, RoomContext roomContext) {
        this.objectId = objectId;
        this.position = position;
        this.roomContext = roomContext;
    }

    @Override
    public int getObjectId() {
        return this.objectId;
    }

    @Override
    public Position getPosition() {
        return this.position;
    }

    @Override
    public RoomContext getContext() {
        return this.roomContext;
    }
}
