package com.cometproject.game.rooms.types.components;

import com.cometproject.api.game.rooms.RoomContext;
import com.cometproject.api.game.rooms.components.ITradeComponent;

public class TradeComponent implements ITradeComponent {

    private final RoomContext roomContext;

    public TradeComponent(RoomContext roomContext) {
        this.roomContext = roomContext;
    }

    @Override
    public RoomContext getContext() {
        return this.roomContext;
    }
}
