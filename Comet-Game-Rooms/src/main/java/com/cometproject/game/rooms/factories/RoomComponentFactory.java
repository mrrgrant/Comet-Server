package com.cometproject.game.rooms.factories;

import com.cometproject.api.game.rooms.RoomContext;
import com.cometproject.api.game.rooms.components.*;
import com.cometproject.api.game.rooms.factories.IRoomComponentFactory;
import com.cometproject.api.game.rooms.factories.IRoomEntityFactory;
import com.cometproject.game.rooms.types.components.*;

public class RoomComponentFactory implements IRoomComponentFactory {

    @Override
    public IEntityComponent createEntityComponent(RoomContext roomContext, IRoomEntityFactory entityFactory) {
        return new EntityComponent(roomContext, entityFactory);
    }

    @Override
    public IGameComponent createGameComponent(RoomContext roomContext) {
        return new GameComponent(roomContext);
    }

    @Override
    public ITileComponent createTileComponent(RoomContext roomContext, int mapSizeX, int mapSizeY) {
        return new TileComponent(roomContext, mapSizeX, mapSizeY);
    }

    @Override
    public ITradeComponent createTradeComponent(RoomContext roomContext) {
        return new TradeComponent(roomContext);
    }

    @Override
    public IProcessComponent createProcessComponent(RoomContext roomContext) {
        return new ProcessComponent(roomContext);
    }

    @Override
    public IFilterComponent createFilterComponent(RoomContext roomContext) {
        return new FilterComponent(roomContext);
    }

    @Override
    public IRightsComponent createRightsComponent(RoomContext roomContext) {
        return new RightsComponent(roomContext);
    }
}