package com.cometproject.api.game.rooms.pathfinding;

public class PathfinderContext {
    private static PathfinderContext currentContext;

    private IPathfinder pathfinder;

    public static PathfinderContext getCurrent() {
        return currentContext;
    }

    public static void setCurrent(PathfinderContext pathfinderContext) {
        currentContext = currentContext;
    }
}
