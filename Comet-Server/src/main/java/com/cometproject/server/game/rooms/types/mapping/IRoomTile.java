package com.cometproject.server.game.rooms.types.mapping;

import com.cometproject.api.game.rooms.models.RoomTileState;
import com.cometproject.api.game.rooms.tiles.RoomEntityMovementNode;
import com.cometproject.api.game.rooms.tiles.RoomTileStatusType;
import com.cometproject.api.game.utilities.Position;
import com.cometproject.server.game.rooms.objects.RoomObject;
import com.cometproject.server.game.rooms.objects.entities.RoomEntity;
import com.cometproject.server.game.rooms.objects.items.RoomItemFloor;

import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

public interface IRoomTile {
    List<RoomTile> getAdjacentTiles(Position from);

    void reload();

    void dispose();

    void onEntityEntersTile(RoomEntity entity);

    void scheduleEvent(int entityId, Consumer<RoomEntity> event);

    RoomEntityMovementNode getMovementNode();

    double getStackHeight();

    double getStackHeight(RoomItemFloor itemToStack);

    double getWalkHeight();

    boolean isReachable(RoomEntity entity);

    boolean isReachable(RoomObject object);

    RoomEntity getEntity();

    Set<RoomEntity> getEntities();

    RoomTileStatusType getStatus();

    Position getPosition();

    boolean canStack();

    long getTopItem();

    void setTopItem(int topItem);

    RoomItemFloor getTopItemInstance();

    Position getRedirect();

    void setRedirect(Position redirect);

    long getOriginalTopItem();

    double getOriginalHeight();

    boolean canPlaceItemHere();

    boolean hasItems();

    double getTileHeight();

    boolean hasMagicTile();

    List<RoomItemFloor> getItems();

    boolean hasAdjustableHeight();

    RoomTileState getState();

    boolean hasGate();
}
