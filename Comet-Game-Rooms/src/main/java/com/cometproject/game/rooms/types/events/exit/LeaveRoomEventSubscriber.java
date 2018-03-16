package com.cometproject.game.rooms.types.events.exit;

import com.cometproject.game.rooms.types.events.RoomEventSubscriber;

public class LeaveRoomEventSubscriber extends RoomEventSubscriber<LeaveRoomEvent> {
    @Override
    public boolean onEvent(LeaveRoomEvent event) {



        return false;
    }
}
