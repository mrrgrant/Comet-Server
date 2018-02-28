package com.cometproject.api.game.rooms;

import com.cometproject.api.game.rooms.components.*;

public interface IRoom {
    RoomContext getContext();

    IEntityComponent getEntities();

    IGameComponent getGame();

    IProcessComponent getProcess();

    ITileComponent getTiles();

    ITradeComponent getTrade();

    IFilterComponent getFilter();

    IRoomData getData();

}
