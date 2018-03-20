package com.cometproject.api.game.rooms.legacy;

import com.cometproject.api.game.rooms.IRoom;
import com.cometproject.api.game.rooms.tiles.IRoomTile;
import com.cometproject.api.game.utilities.Position;

public interface IRoomObject {
    int getId();

    Position getPosition();

    IRoomTile getTile();

    IRoom getRoom();
}
