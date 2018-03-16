package com.cometproject.api.game.rooms.attributes;

public interface IAttributableRoomObject {
    boolean hasAttribute(RoomObjectAttr key);

    <T> void setAttribute(RoomObjectAttr<T> key, T data);

    <T> T getAttribute(RoomObjectAttr<T> key);
}
