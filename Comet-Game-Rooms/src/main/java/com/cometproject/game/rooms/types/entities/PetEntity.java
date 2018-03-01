package com.cometproject.game.rooms.types.entities;

import com.cometproject.api.game.rooms.RoomContext;
import com.cometproject.api.game.rooms.entities.EntityPosition;
import com.cometproject.game.rooms.types.entities.base.MobileRoomEntity;

public class PetEntity extends MobileRoomEntity {
    public PetEntity(RoomContext roomContext, int entityId, EntityPosition position) {
        super(roomContext, entityId, position);
    }
}
