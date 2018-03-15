package com.cometproject.api.game.rooms.items.behaviour;

        import com.cometproject.api.game.rooms.entities.IRoomEntity;
        import com.cometproject.api.game.utilities.Position;

public interface IActiveItemBehaviour  {
    boolean canStepOn(IRoomEntity entity);

    boolean isMovementCancelled(IRoomEntity entity);

    boolean isMovementCancelled(IRoomEntity entity, Position position);
}
