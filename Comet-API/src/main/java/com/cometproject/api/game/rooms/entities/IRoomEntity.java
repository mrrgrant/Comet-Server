package com.cometproject.api.game.rooms.entities;

import com.cometproject.api.game.rooms.RoomContext;
import com.cometproject.api.game.utilities.Position;

import java.util.Map;

public interface IRoomEntity {
    int getId();

    Position getPosition();

    int getHeadRotation();

    int getBodyRotation();

    Map<RoomEntityStatus, String> getStatuses();

    void addStatus(RoomEntityStatus key, String value);

    void removeStatus(RoomEntityStatus status);

    boolean hasStatus(RoomEntityStatus key);

    RoomContext getContext();
}
