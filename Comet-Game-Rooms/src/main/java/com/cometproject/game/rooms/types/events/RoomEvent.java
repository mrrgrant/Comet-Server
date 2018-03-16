package com.cometproject.game.rooms.types.events;

import com.cometproject.api.game.players.IPlayer;
import com.cometproject.api.game.rooms.IRoom;

public class RoomEvent {

    private final IPlayer player;
    private final IRoom room;

    public RoomEvent(IPlayer player, IRoom room) {
        this.player = player;
        this.room = room;
    }

    public IPlayer getPlayer() {
        return player;
    }

    public IRoom getRoom() {
        return room;
    }
}
