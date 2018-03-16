package com.cometproject.game.rooms.types.events.exit;

import com.cometproject.api.game.players.IPlayer;
import com.cometproject.api.game.rooms.IRoom;
import com.cometproject.game.rooms.types.events.RoomEvent;

public class LeaveRoomEvent extends RoomEvent {
    public LeaveRoomEvent(IPlayer player, IRoom room) {
        super(player, room);
    }
}
