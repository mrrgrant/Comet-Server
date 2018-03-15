package com.cometproject.api.game.rooms.components;

import com.cometproject.api.game.rooms.IRoomComponent;
import com.cometproject.api.game.rooms.objects.IRoomObject;
import com.cometproject.api.game.rooms.tiles.IRoomTile;
import com.cometproject.api.game.utilities.Position;

public interface ITileComponent extends IRoomComponent {

    boolean tileHasEntity(Position position);

    IRoomTile getTile(Position position);

}
