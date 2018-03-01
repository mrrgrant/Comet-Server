package com.cometproject.game.rooms.types.entities.base;

import com.cometproject.api.game.rooms.RoomContext;
import com.cometproject.api.game.rooms.entities.EntityPosition;
import com.cometproject.api.game.rooms.entities.IMobileRoomEntity;
import com.cometproject.api.game.utilities.Position;

public class MobileRoomEntity extends RoomEntity implements IMobileRoomEntity {

    public MobileRoomEntity(RoomContext roomContext, int entityId, EntityPosition position) {
        super(roomContext, entityId, position);
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
    public void setBodyRotation(int bodyRotation) {
        this.entityPosition.setBodyRotation(bodyRotation);
    }

    @Override
    public void setHeadRotation(int headRotation) {
        this.entityPosition.setHeadRotation(headRotation);
    }

    @Override
    public void setPosition(Position position) {
        this.entityPosition.setRoomPosition(position);
    }

    @Override
    public void moveTo(Position position) {
        // Move to the position
    }

    @Override
    public void warpTo(Position position) {
        // warp to the position
    }
}
