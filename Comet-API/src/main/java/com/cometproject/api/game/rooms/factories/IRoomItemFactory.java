package com.cometproject.api.game.rooms.factories;

import com.cometproject.api.game.furniture.types.FurnitureDefinition;
import com.cometproject.api.game.rooms.items.IRoomItem;
import com.cometproject.api.game.rooms.objects.data.RoomItemData;

public interface IRoomItemFactory {
    void registerType(String interactionType, Class<? extends IRoomItem> itemClass);

    IRoomItem createRoomItem(RoomItemData roomItemData, FurnitureDefinition furnitureDefinition) throws Exception;
}
