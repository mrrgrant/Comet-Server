package com.cometproject.api.game.rooms.services;

import com.cometproject.api.game.rooms.IRoomData;
import com.cometproject.api.utilities.Initialisable;

public interface IRoomService {
    IRoomData getRoomData(int roomId);

    void saveRoomData(IRoomData roomData);
}
