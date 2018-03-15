package com.cometproject.game.rooms.types.items;

import com.cometproject.api.game.furniture.types.FurnitureDefinition;
import com.cometproject.api.game.rooms.RoomContext;
import com.cometproject.api.game.rooms.entities.IRoomEntity;
import com.cometproject.api.game.rooms.items.behaviour.IActiveItemBehaviour;
import com.cometproject.api.game.rooms.objects.data.RoomItemData;
import com.cometproject.api.game.rooms.tiles.IRoomTile;
import com.cometproject.api.game.utilities.Position;

public abstract class ActiveItemBehaviour extends RoomItem implements IActiveItemBehaviour {
    public ActiveItemBehaviour(RoomContext roomContext, RoomItemData roomItemData, int virtualId,
                               IRoomTile startingTile, FurnitureDefinition furnitureDefinition) {
        super(roomContext, roomItemData, virtualId, startingTile, furnitureDefinition);
    }

    @Override
    public boolean canStepOn(IRoomEntity entity) {
        return true;
    }

    @Override
    public boolean isMovementCancelled(IRoomEntity entity) {
        return false;
    }

    @Override
    public boolean isMovementCancelled(IRoomEntity entity, Position position) {
        return false;
    }
}
