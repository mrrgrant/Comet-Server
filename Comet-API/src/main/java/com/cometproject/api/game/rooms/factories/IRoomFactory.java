package com.cometproject.api.game.rooms.factories;

import com.cometproject.api.game.rooms.IRoom;
import com.cometproject.api.game.rooms.IRoomData;

public interface IRoomFactory {

    IRoom createRoom(IRoomData roomData);

}
