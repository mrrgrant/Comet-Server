package com.cometproject.game.rooms.types;

import com.cometproject.api.game.rooms.IRoom;
import com.cometproject.api.game.rooms.IRoomData;
import com.cometproject.api.game.rooms.RoomContext;
import com.cometproject.api.game.rooms.components.*;

public class Room implements IRoom {

    private final RoomContext roomContext;

    private final IEntityComponent entityComponent;
    private final IGameComponent gameComponent;
    private final IProcessComponent processComponent;
    private final ITileComponent tileComponent;
    private final ITradeComponent tradeComponent;
    private final IFilterComponent filterComponent;
    private final IRightsComponent rightsComponent;

    public Room(RoomContext roomContext, IEntityComponent entityComponent, IGameComponent gameComponent,
                IProcessComponent processComponent, ITileComponent tileComponent,
                ITradeComponent tradeComponent, IFilterComponent filterComponent, IRightsComponent rightsComponent) {
        this.roomContext = roomContext;
        this.entityComponent = entityComponent;
        this.gameComponent = gameComponent;
        this.processComponent = processComponent;
        this.tileComponent = tileComponent;
        this.tradeComponent = tradeComponent;
        this.filterComponent = filterComponent;
        this.rightsComponent = rightsComponent;
    }

    @Override
    public RoomContext getContext() {
        return this.roomContext;
    }

    @Override
    public IEntityComponent getEntities() {
        return this.entityComponent;
    }

    @Override
    public IGameComponent getGame() {
        return this.gameComponent;
    }

    @Override
    public IProcessComponent getProcess() {
        return this.processComponent;
    }

    @Override
    public ITileComponent getTiles() {
        return this.tileComponent;
    }

    @Override
    public ITradeComponent getTrade() {
        return this.tradeComponent;
    }

    @Override
    public IFilterComponent getFilter() {
        return this.filterComponent;
    }

    @Override
    public IRightsComponent getRights() {
        return this.rightsComponent;
    }

    @Override
    public IRoomData getData() {
        return this.roomContext.getRoomData();
    }
}
