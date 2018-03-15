package com.cometproject.game.rooms.types.items;

import com.cometproject.api.game.furniture.types.FurnitureDefinition;
import com.cometproject.api.game.rooms.RoomContext;
import com.cometproject.api.game.rooms.objects.data.RoomItemData;
import com.cometproject.api.game.rooms.tiles.IRoomTile;

public abstract class FloorItem extends ActiveRoomItem {
    public FloorItem(RoomContext roomContext, RoomItemData roomItemData, int virtualId,
                     IRoomTile startingTile, FurnitureDefinition furnitureDefinition) {
        super(roomContext, roomItemData, virtualId, startingTile, furnitureDefinition);
    }
}
