package com.cometproject.game.rooms.types.entities;

import com.cometproject.api.game.players.IPlayer;
import com.cometproject.api.game.rooms.RoomContext;
import com.cometproject.api.game.rooms.entities.EntityPosition;
import com.cometproject.api.game.rooms.entities.IPlayerEntity;
import com.cometproject.api.game.utilities.Position;

public class PlayerEntity extends MobileRoomEntity implements IPlayerEntity {
    private final IPlayer player;

    public PlayerEntity(IPlayer player, RoomContext roomContext, int entityId, EntityPosition position) {
        super(roomContext, entityId, position);

        this.player = player;
    }

    @Override
    public IPlayer getPlayer() {
        return this.player;
    }
}
