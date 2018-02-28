package com.cometproject.api.game.rooms.entities;

import com.cometproject.api.game.utilities.Position;

public interface IMobileRoomEntity extends RoomEntity {

    void setBodyRotation(int bodyRotation);

    void setHeadRotation(int headRotation);

    void setPosition(Position position);

    void moveTo(Position position);

    void warpTo(Position position);

}
