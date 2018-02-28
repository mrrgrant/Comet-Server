package com.cometproject.api.game.rooms.entities;

import com.cometproject.api.game.utilities.Position;

public class EntityPosition {

    private Position roomPosition;

    private int headRotation;
    private int bodyRotation;

    public EntityPosition(Position roomPosition, int headRotation, int bodyRotation) {
        this.roomPosition = roomPosition;
        this.headRotation = headRotation;
        this.bodyRotation = bodyRotation;
    }

    public Position getRoomPosition() {
        return roomPosition;
    }

    public void setRoomPosition(Position roomPosition) {
        this.roomPosition = roomPosition;
    }

    public int getHeadRotation() {
        return headRotation;
    }

    public void setHeadRotation(int headRotation) {
        this.headRotation = headRotation;
    }

    public int getBodyRotation() {
        return bodyRotation;
    }

    public void setBodyRotation(int bodyRotation) {
        this.bodyRotation = bodyRotation;
    }
}
