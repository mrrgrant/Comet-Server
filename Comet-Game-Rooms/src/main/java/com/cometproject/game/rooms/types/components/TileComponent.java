package com.cometproject.game.rooms.types.components;

import com.cometproject.api.game.rooms.RoomContext;
import com.cometproject.api.game.rooms.components.ITileComponent;
import com.cometproject.api.game.rooms.tiles.IRoomTile;
import com.cometproject.api.game.utilities.Position;
import com.cometproject.game.rooms.types.tiles.RoomTile;

public class TileComponent implements ITileComponent {

    private final RoomContext roomContext;

    private final IRoomTile[][] tiles;

    public TileComponent(RoomContext roomContext, int mapSizeX, int mapSizeY) {
        this.roomContext = roomContext;

        this.tiles = new RoomTile[mapSizeX][mapSizeY];
    }

    @Override
    public RoomContext getContext() {
        return this.roomContext;
    }

    @Override
    public boolean tileHasEntity(Position position) {
        return this.getTile(position).getEntity() != null;
    }

    @Override
    public IRoomTile getTile(Position position) {
        return this.tiles[position.getX()][position.getY()];
    }
}
