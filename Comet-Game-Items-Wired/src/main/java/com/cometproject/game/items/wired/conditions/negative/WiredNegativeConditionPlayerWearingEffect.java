package com.cometproject.game.items.wired.conditions.negative;

import com.cometproject.api.game.rooms.objects.data.RoomItemData;
import com.cometproject.game.items.wired.conditions.positive.WiredConditionPlayerWearingEffect;
import com.cometproject.server.game.rooms.types.Room;


public class WiredNegativeConditionPlayerWearingEffect extends WiredConditionPlayerWearingEffect {

    public WiredNegativeConditionPlayerWearingEffect(RoomItemData itemData, Room room) {
        super(itemData, room);
    }
}
