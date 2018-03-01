package com.cometproject.game.items.wired.conditions.negative;

import com.cometproject.api.game.rooms.objects.data.RoomItemData;
import com.cometproject.game.items.wired.conditions.positive.WiredConditionHasFurniOn;
import com.cometproject.server.game.rooms.types.Room;


public class WiredNegativeConditionHasFurniOn extends WiredConditionHasFurniOn {

    public WiredNegativeConditionHasFurniOn(RoomItemData itemData, Room room) {
        super(itemData, room);
    }
}
