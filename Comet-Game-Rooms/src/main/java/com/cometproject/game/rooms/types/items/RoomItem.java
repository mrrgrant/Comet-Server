package com.cometproject.game.rooms.types.items;

import com.cometproject.api.game.furniture.types.FurnitureDefinition;
import com.cometproject.api.game.rooms.RoomContext;
import com.cometproject.api.game.rooms.items.IRoomItem;
import com.cometproject.api.game.rooms.objects.data.RoomItemData;
import com.cometproject.api.game.rooms.tiles.IRoomTile;

public abstract class RoomItem implements IRoomItem {

    private final int virtualId;
    private final RoomContext roomContext;
    private final RoomItemData roomItemData;
    private final FurnitureDefinition furnitureDefinition;

    private IRoomTile roomTile;

    public RoomItem(final RoomContext roomContext, final RoomItemData roomItemData, final int virtualId,
                    final IRoomTile startingTile, final FurnitureDefinition furnitureDefinition) {
        this.virtualId = virtualId;
        this.roomContext = roomContext;
        this.roomItemData = roomItemData;
        this.furnitureDefinition = furnitureDefinition;

        this.roomTile = startingTile;
    }

    @Override
    public long getId() {
        return this.roomItemData.getId();
    }

    @Override
    public int getVirtualId() {
        return this.virtualId;
    }

    @Override
    public RoomItemData getData() {
        return this.roomItemData;
    }

    @Override
    public IRoomTile getTile() {
        return this.roomTile;
    }

    @Override
    public FurnitureDefinition getDefinition() {
        return this.furnitureDefinition;
    }

    @Override
    public RoomContext getContext() {
        return this.roomContext;
    }
}
