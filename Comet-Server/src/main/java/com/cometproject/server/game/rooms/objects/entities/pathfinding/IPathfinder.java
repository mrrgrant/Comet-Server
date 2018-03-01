package com.cometproject.server.game.rooms.objects.entities.pathfinding;

import com.cometproject.api.game.utilities.Position;
import com.cometproject.server.game.rooms.objects.RoomObject;

import java.util.List;

public interface IPathfinder {
    byte DISABLE_DIAGONAL = 0;
    byte ALLOW_DIAGONAL = 1;

    List<Square> makePath(RoomObject roomFloorObject, Position end);

    List<Square> makePath(RoomObject roomFloorObject, Position end, byte pathfinderMode, boolean isRetry);

    boolean isValidStep(RoomObject roomObject, Position from, Position to, boolean lastStep, boolean isRetry);
}
