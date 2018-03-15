package com.cometproject.game.rooms.types.items;

import com.cometproject.api.game.furniture.types.FurnitureDefinition;
import com.cometproject.api.game.rooms.RoomContext;
import com.cometproject.api.game.rooms.entities.IRoomEntity;
import com.cometproject.api.game.rooms.items.behaviour.IActiveRoomItem;
import com.cometproject.api.game.rooms.items.IRoomItem;
import com.cometproject.api.game.rooms.objects.data.RoomItemData;
import com.cometproject.api.game.rooms.tiles.IRoomTile;
import com.cometproject.api.game.utilities.Position;

public abstract class ActiveRoomItem extends ActiveItemBehaviour implements IRoomItem, IActiveRoomItem {
    public ActiveRoomItem(RoomContext roomContext, RoomItemData roomItemData, int virtualId,
                          IRoomTile startingTile, FurnitureDefinition furnitureDefinition) {
        super(roomContext, roomItemData, virtualId, startingTile, furnitureDefinition);
    }

    @Override
    public void onItemAddedToStack(IRoomItem floorItem) {

    }

    @Override
    public void onEntityPreStepOn(IRoomEntity entity) {

    }

    @Override
    public void onEntityStepOn(IRoomEntity entity) {

    }

    @Override
    public void onEntityPostStepOn(IRoomEntity entity) {

    }

    @Override
    public void onEntityStepOff(IRoomEntity entity) {

    }

    @Override
    public void onPositionChanged(Position oldPosition, Position newPosition) {

    }
}
