package com.cometproject.api.game.rooms.factories;

import com.cometproject.api.game.rooms.RoomContext;
import com.cometproject.api.game.rooms.components.*;

public interface IRoomComponentFactory {

    IEntityComponent createEntityComponent(RoomContext roomContext);

    IGameComponent createGameComponent(RoomContext roomContext);

    ITileComponent createTileComponent(RoomContext roomContext);

    ITradeComponent createTradeComponent(RoomContext roomContext);

    IProcessComponent createProcessComponent(RoomContext roomContext);

    IFilterComponent createFilterComponent(RoomContext roomContext);

    IRightsComponent createRightsComponent(RoomContext roomContext);

}
