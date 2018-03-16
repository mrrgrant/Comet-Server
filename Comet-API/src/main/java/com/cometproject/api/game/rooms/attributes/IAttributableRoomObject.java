package com.cometproject.api.game.rooms.attributes;

import com.cometproject.api.game.rooms.objects.IRoomObject;

public interface IAttributableRoomObject extends IRoomObject {
    boolean hasAttribute(RoomObjectAttr key);

    <T> void setAttribute(RoomObjectAttr<T> key, T data);

    <T> T getAttribute(RoomObjectAttr<T> key);
}
