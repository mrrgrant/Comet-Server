package com.cometproject.api.game.rooms.entities;

import com.cometproject.api.game.rooms.RoomContext;
import com.cometproject.api.game.utilities.Position;

public interface IRoomEntity {
    int getId();

    Position getPosition();

    int getHeadRotation();

    int getBodyRotation();

    RoomContext getContext();
}
