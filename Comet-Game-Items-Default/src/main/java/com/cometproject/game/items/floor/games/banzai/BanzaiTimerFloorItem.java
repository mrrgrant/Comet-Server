package com.cometproject.game.items.floor.games.banzai;

import com.cometproject.api.game.rooms.objects.data.RoomItemData;
import com.cometproject.game.items.floor.games.AbstractGameTimerFloorItem;
import com.cometproject.server.game.rooms.types.Room;
import com.cometproject.server.game.rooms.types.components.games.GameType;


public class BanzaiTimerFloorItem extends AbstractGameTimerFloorItem {

    public BanzaiTimerFloorItem(RoomItemData itemData, Room room) {
        super(itemData, room);
    }

    @Override
    public GameType getGameType() {
        return GameType.BANZAI;
    }
}
