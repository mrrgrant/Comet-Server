package com.cometproject.api.game.rooms.legacy;

import com.cometproject.api.game.rooms.IRoomData;
import com.cometproject.api.game.rooms.components.legacy.IMappingComponent;

public interface IRoom {
    IMappingComponent getMapping();

    IRoomData getData();
}
