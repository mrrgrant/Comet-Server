package com.cometproject.game.rooms.types.entities;

import com.cometproject.api.game.rooms.RoomContext;
import com.cometproject.api.game.rooms.entities.EntityPosition;

public class BotEntity extends MobileRoomEntity {
    public BotEntity(RoomContext roomContext, int entityId, EntityPosition position) {
        super(roomContext, entityId, position);
    }
}
