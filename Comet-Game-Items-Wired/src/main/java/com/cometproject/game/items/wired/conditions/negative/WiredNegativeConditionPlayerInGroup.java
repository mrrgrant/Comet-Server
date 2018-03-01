package com.cometproject.game.items.wired.conditions.negative;

import com.cometproject.api.game.rooms.objects.data.RoomItemData;
import com.cometproject.game.items.wired.conditions.positive.WiredConditionPlayerInGroup;
import com.cometproject.server.game.rooms.types.Room;


public class WiredNegativeConditionPlayerInGroup extends WiredConditionPlayerInGroup {

    public WiredNegativeConditionPlayerInGroup(RoomItemData itemData, Room room) {
        super(itemData, room);
    }
}
