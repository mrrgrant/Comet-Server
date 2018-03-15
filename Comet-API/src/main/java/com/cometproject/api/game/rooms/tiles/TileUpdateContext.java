package com.cometproject.api.game.rooms.tiles;

import com.cometproject.api.game.rooms.IRoom;

public class TileUpdateContext {

    private final IRoomTile roomTile;

    public TileUpdateContext(IRoomTile tile) {
        this.roomTile = tile;
    }

    public IRoomTile getRoomTile() {
        return this.roomTile;
    }
}
