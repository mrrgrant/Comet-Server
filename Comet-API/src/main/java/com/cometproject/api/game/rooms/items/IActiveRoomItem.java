package com.cometproject.api.game.rooms.items;

import com.cometproject.api.game.rooms.entities.IRoomEntity;
import com.cometproject.api.game.utilities.Position;

public interface IActiveRoomItem extends IRoomItem {

    void onItemAddedToStack(IRoomItem floorItem);

    void onEntityPreStepOn(IRoomEntity entity);

    void onEntityStepOn(IRoomEntity entity);

    void onEntityPostStepOn(IRoomEntity entity);

    void onEntityStepOff(IRoomEntity entity);

    void onPositionChanged(Position newPosition);

    boolean isMovementCancelled(IRoomEntity entity);

    boolean isMovementCancelled(IRoomEntity entity, Position position);
}
