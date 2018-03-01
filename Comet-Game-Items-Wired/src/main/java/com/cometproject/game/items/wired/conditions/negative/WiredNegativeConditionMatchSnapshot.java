package com.cometproject.game.items.wired.conditions.negative;

import com.cometproject.api.game.rooms.objects.data.RoomItemData;
import com.cometproject.game.items.wired.conditions.positive.WiredConditionMatchSnapshot;
import com.cometproject.server.game.rooms.types.Room;


public class WiredNegativeConditionMatchSnapshot extends WiredConditionMatchSnapshot {
    WiredNegativeConditionMatchSnapshot(RoomItemData itemData, Room room) {
        super(itemData, room);
    }
}
