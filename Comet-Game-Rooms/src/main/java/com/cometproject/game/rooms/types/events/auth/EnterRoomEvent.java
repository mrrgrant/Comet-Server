package com.cometproject.game.rooms.types.events.auth;

import com.cometproject.api.game.players.IPlayer;
import com.cometproject.api.game.rooms.IRoom;
import com.cometproject.game.rooms.types.events.RoomEvent;

public class EnterRoomEvent extends RoomEvent {
    public EnterRoomEvent(IPlayer player, IRoom room) {
        super(player, room);
    }
}
