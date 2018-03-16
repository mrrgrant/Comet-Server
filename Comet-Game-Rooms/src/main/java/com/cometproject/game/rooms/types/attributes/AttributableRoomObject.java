package com.cometproject.game.rooms.types.attributes;

import com.cometproject.api.game.rooms.attributes.IAttributableRoomObject;
import com.cometproject.api.game.rooms.attributes.RoomObjectAttr;
import com.google.common.collect.Maps;

import java.util.Map;

public class AttributableRoomObject implements IAttributableRoomObject {
    private final Map<String, Object> attributes = Maps.newConcurrentMap();

    @Override
    public boolean hasAttribute(RoomObjectAttr key) {
        return this.attributes.containsKey(key.getName());
    }

    @Override
    public <T> void setAttribute(RoomObjectAttr<T> key, T data) {
        this.attributes.put(key.getName(), data);
    }

    @Override
    public <T> T getAttribute(RoomObjectAttr<T> key) {
        try {
            return (T) this.attributes.get(key.getName());
        } catch (ClassCastException ex) {
            return null;
        }
    }
}
