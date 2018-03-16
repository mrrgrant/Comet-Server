package com.cometproject.api.game.rooms.attributes;

public class RoomObjectAttr<T> {
    private final String name;
    private final T data;

    public RoomObjectAttr(String name, T data) {
        this.name = name;
        this.data = data;
    }

    public String getName() {
        return this.name;
    }

    public T getData() {
        return this.data;
    }
}