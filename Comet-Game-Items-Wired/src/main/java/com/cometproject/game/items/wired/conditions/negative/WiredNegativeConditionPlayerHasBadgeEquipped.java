package com.cometproject.game.items.wired.conditions.negative;

import com.cometproject.api.game.rooms.objects.data.RoomItemData;
import com.cometproject.game.items.wired.conditions.positive.WiredConditionPlayerHasBadgeEquipped;
import com.cometproject.server.game.rooms.types.Room;


public class WiredNegativeConditionPlayerHasBadgeEquipped extends WiredConditionPlayerHasBadgeEquipped {

    public WiredNegativeConditionPlayerHasBadgeEquipped(RoomItemData itemData, Room room) {
        super(itemData, room);
    }
}
