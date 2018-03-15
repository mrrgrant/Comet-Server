package com.cometproject.api.game.rooms.factories;

import com.cometproject.api.game.rooms.RoomContext;
import com.cometproject.api.game.rooms.components.*;

public interface IRoomComponentFactory {

    IEntityComponent createEntityComponent(RoomContext roomContext, IRoomEntityFactory entityFactory);

    IGameComponent createGameComponent(RoomContext roomContext);

    ITileComponent createTileComponent(RoomContext roomContext, int mapSizeX, int mapSizeY);

    ITradeComponent createTradeComponent(RoomContext roomContext);

    IProcessComponent createProcessComponent(RoomContext roomContext);

    IFilterComponent createFilterComponent(RoomContext roomContext);

    IRightsComponent createRightsComponent(RoomContext roomContext);

}
