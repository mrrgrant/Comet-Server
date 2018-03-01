package com.cometproject.api.game.rooms.services;

import com.cometproject.api.game.furniture.types.FurnitureDefinition;
import com.cometproject.api.game.rooms.factories.IRoomItemFactory;
import com.cometproject.api.game.rooms.items.IRoomItem;
import com.cometproject.api.game.rooms.objects.data.RoomItemData;

public interface IRoomItemService {
    IRoomItemFactory getItemFactory();

    void saveItem(IRoomItem item);

}
