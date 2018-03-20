package com.cometproject.api.game.rooms.objects;

import com.cometproject.api.game.rooms.IRoom;
import com.cometproject.api.game.rooms.RoomContext;
import com.cometproject.api.game.utilities.Position;

public interface IRoomObject<IdType> {
    IdType getId();

    Position getPosition();

    RoomContext getContext();
}
