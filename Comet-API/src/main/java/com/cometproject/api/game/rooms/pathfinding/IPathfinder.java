package com.cometproject.api.game.rooms.pathfinding;

import com.cometproject.api.game.rooms.legacy.IRoomObject;
import com.cometproject.api.game.utilities.Position;
import javafx.geometry.Pos;

import java.util.List;

public interface IPathfinder {
    byte DISABLE_DIAGONAL = 0;
    byte ALLOW_DIAGONAL = 1;

    List<Position> makePath(IRoomObject roomFloorObject, Position end);

    List<Position> makePath(IRoomObject roomFloorObject, Position end, byte pathfinderMode, boolean isRetry);

    boolean isValidStep(IRoomObject roomObject, Position from, Position to, boolean lastStep, boolean isRetry);
}

