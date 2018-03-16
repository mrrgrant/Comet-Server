package com.cometproject.game.rooms.types.events;

public abstract class RoomEventSubscriber<T extends RoomEvent> {
    public abstract boolean onEvent(T event);
}
