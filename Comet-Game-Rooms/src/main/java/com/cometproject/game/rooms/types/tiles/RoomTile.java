package com.cometproject.game.rooms.types.tiles;

import com.cometproject.api.game.rooms.entities.IRoomEntity;
import com.cometproject.api.game.rooms.items.IRoomItem;
import com.cometproject.api.game.rooms.models.RoomTileState;
import com.cometproject.api.game.rooms.tiles.IRoomTile;
import com.cometproject.api.game.rooms.tiles.RoomEntityMovementNode;
import com.cometproject.api.game.rooms.tiles.RoomTileStatusType;
import com.cometproject.api.game.utilities.Position;
import com.google.common.collect.Sets;

import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

public class RoomTile implements IRoomTile {
    private final Set<IRoomEntity> entities;

    public RoomTile() {
        this.entities = Sets.newConcurrentHashSet();
    }

    @Override
    public List<IRoomTile> getAdjacentTiles(Position from) {
        return null;
    }

    @Override
    public void reload() {
        // Run all reload shit for tiles
    }

    @Override
    public void dispose() {
        this.entities.clear();
    }

    @Override
    public void onEntityEntersTile(IRoomEntity entity) {

    }

    @Override
    public void scheduleEvent(int entityId, Consumer<IRoomEntity> event) {

    }

    @Override
    public RoomEntityMovementNode getMovementNode() {
        return null;
    }

    @Override
    public double getStackHeight() {
        return 0;
    }

    @Override
    public double getStackHeight(IRoomItem itemToStack) {
        return 0;
    }

    @Override
    public double getWalkHeight() {
        return 0;
    }

    @Override
    public boolean isReachable(IRoomEntity entity) {
        return false;
    }

    @Override
    public boolean isReachable(IRoomItem object) {
        return false;
    }

    @Override
    public IRoomEntity getEntity() {
        return null;
    }

    @Override
    public Set<IRoomEntity> getEntities() {
        return null;
    }

    @Override
    public RoomTileStatusType getStatus() {
        return null;
    }

    @Override
    public Position getPosition() {
        return null;
    }

    @Override
    public boolean canStack() {
        return false;
    }

    @Override
    public long getTopItem() {
        return 0;
    }

    @Override
    public void setTopItem(int topItem) {

    }

    @Override
    public IRoomItem getTopItemInstance() {
        return null;
    }

    @Override
    public Position getRedirect() {
        return null;
    }

    @Override
    public void setRedirect(Position redirect) {

    }

    @Override
    public long getOriginalTopItem() {
        return 0;
    }

    @Override
    public double getOriginalHeight() {
        return 0;
    }

    @Override
    public boolean canPlaceItemHere() {
        return false;
    }

    @Override
    public boolean hasItems() {
        return false;
    }

    @Override
    public double getTileHeight() {
        return 0;
    }

    @Override
    public boolean hasMagicTile() {
        return false;
    }

    @Override
    public List<IRoomItem> getItems() {
        return null;
    }

    @Override
    public boolean hasAdjustableHeight() {
        return false;
    }

    @Override
    public RoomTileState getState() {
        return null;
    }

    @Override
    public boolean hasGate() {
        return false;
    }
}
