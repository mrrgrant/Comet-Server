package com.cometproject.game.items.wired.conditions.positive;

import com.cometproject.api.game.rooms.objects.data.RoomItemData;
import com.cometproject.server.game.rooms.objects.entities.RoomEntity;
import com.cometproject.game.items.wired.base.WiredConditionItem;
import com.cometproject.server.game.rooms.types.Room;

public class WiredConditionDateRange extends WiredConditionItem {

    public WiredConditionDateRange(RoomItemData itemData, Room room) {
        super(itemData, room);
    }

    @Override
    public int getInterface() {
        return 24;
    }

    @Override
    public boolean evaluate(RoomEntity entity, Object data) {
        return false;
    }
}
