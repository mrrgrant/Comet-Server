package com.cometproject.api.game.rooms.tiles;

import com.cometproject.api.game.rooms.legacy.entities.IRoomEntity;
import com.cometproject.api.game.rooms.items.IRoomItem;
import com.cometproject.api.game.rooms.models.RoomTileState;
import com.cometproject.api.game.utilities.Position;

import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

public interface IRoomTile {
    List<IRoomTile> getAdjacentTiles(Position from);

    void reload();

    void dispose();

    void onEntityEntersTile(IRoomEntity entity);

    void scheduleEvent(int entityId, Consumer<IRoomEntity> event);

    RoomEntityMovementNode getMovementNode();

    double getStackHeight();

    double getStackHeight(IRoomItem itemToStack);

    double getWalkHeight();

    boolean isReachable(IRoomEntity entity);

    boolean isReachable(IRoomItem object);

    IRoomEntity getEntity();

    Set<IRoomEntity> getEntities();

    RoomTileStatusType getStatus();

    Position getPosition();

    boolean canStack();

    long getTopItem();

    void setTopItem(int topItem);

    IRoomItem getTopItemInstance();

    Position getRedirect();

    void setRedirect(Position redirect);

    long getOriginalTopItem();

    double getOriginalHeight();

    boolean canPlaceItemHere();

    boolean hasItems();

    double getTileHeight();

    boolean hasMagicTile();

    List<IRoomItem> getItems();

    boolean hasAdjustableHeight();

    RoomTileState getState();

    boolean hasGate();
}
