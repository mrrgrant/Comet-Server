package com.cometproject.game.rooms.factories;

import com.cometproject.api.game.GameContext;
import com.cometproject.api.game.rooms.IRoom;
import com.cometproject.api.game.rooms.IRoomData;
import com.cometproject.api.game.rooms.factories.IRoomFactory;
import com.cometproject.api.game.rooms.RoomContext;
import com.cometproject.api.game.rooms.factories.IRoomComponentFactory;
import com.cometproject.api.game.rooms.models.IRoomModel;
import com.cometproject.game.rooms.types.Room;

public class RoomFactory implements IRoomFactory {

    private final IRoomComponentFactory roomComponentFactory;

    public RoomFactory(IRoomComponentFactory roomComponentFactory) {
        this.roomComponentFactory = roomComponentFactory;
    }

    @Override
    public IRoom createRoom(IRoomData roomData, IRoomModel roomModel) {
        final RoomContext roomContext = new RoomContext(GameContext.getCurrent(), roomData);

        final IRoom room = new Room(roomContext,
                this.roomComponentFactory.createEntityComponent(roomContext),
                this.roomComponentFactory.createGameComponent(roomContext),
                this.roomComponentFactory.createProcessComponent(roomContext),
                this.roomComponentFactory.createTileComponent(roomContext, roomModel.getSizeX(), roomModel.getSizeY()),
                this.roomComponentFactory.createTradeComponent(roomContext),
                this.roomComponentFactory.createFilterComponent(roomContext),
                this.roomComponentFactory.createRightsComponent(roomContext));

        roomContext.setRoom(room);

        return room;
    }
}
