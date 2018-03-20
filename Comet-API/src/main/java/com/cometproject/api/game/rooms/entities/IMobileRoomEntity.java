package com.cometproject.api.game.rooms.entities;

import com.cometproject.api.game.utilities.Position;

public interface IMobileRoomEntity extends IRoomEntity {
    int getHeadRotation();

    int getBodyRotation();

    void setBodyRotation(int bodyRotation);

    void setHeadRotation(int headRotation);

    void setPosition(Position position);

    void moveTo(Position position);

    void warp(Position position);
}
