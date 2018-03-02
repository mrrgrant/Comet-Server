package com.cometproject.api.game.rooms.items;

import com.cometproject.api.game.furniture.types.FurnitureDefinition;
import com.cometproject.api.game.rooms.RoomContext;
import com.cometproject.api.game.rooms.objects.data.RoomItemData;
import com.cometproject.api.game.rooms.tiles.IRoomTile;

public interface IRoomItem {

    long getId();

    int getVirtualId();

    RoomItemData getData();

    IRoomTile getTile();

    void setTile(IRoomItem tile);

    FurnitureDefinition getDefinition();

    void sendUpdate();

    RoomContext getContext();
}

