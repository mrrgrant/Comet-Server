package com.cometproject.game.rooms.types.events.auth;

import com.cometproject.game.rooms.types.events.RoomEventSubscriber;

public class EnterRoomEventSubscriber extends RoomEventSubscriber<EnterRoomEvent> {
    @Override
    public boolean onEvent(EnterRoomEvent event) {

        return false;
    }
}
