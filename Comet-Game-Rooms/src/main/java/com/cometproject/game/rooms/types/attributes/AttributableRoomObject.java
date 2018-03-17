package com.cometproject.game.rooms.types.attributes;

import com.cometproject.api.game.rooms.RoomContext;
import com.cometproject.api.game.rooms.attributes.IAttributableRoomObject;
import com.cometproject.api.game.rooms.attributes.RoomObjectAttr;
import com.cometproject.api.game.utilities.Position;
import com.cometproject.game.rooms.types.objects.RoomObject;
import com.google.common.collect.Maps;

import java.util.Map;

public abstract class AttributableRoomObject extends RoomObject implements IAttributableRoomObject {
    private final Map<String, Object> attributes = Maps.newConcurrentMap();

    public AttributableRoomObject(int objectId, Position position, RoomContext roomContext) {
        super(objectId, position, roomContext);
    }

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
