package com.cometproject.game.rooms.types.items;

import com.cometproject.api.game.rooms.entities.IRoomEntity;
import com.cometproject.api.game.rooms.items.IActiveRoomItem;
import com.cometproject.api.game.rooms.items.IRoomItem;
import com.cometproject.api.game.utilities.Position;

public abstract class ActiveRoomItem implements IRoomItem, IActiveRoomItem {
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
    public void onPositionChanged(Position newPosition) {

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
