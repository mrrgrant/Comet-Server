package com.cometproject.api.game.rooms.entities;

import com.cometproject.api.game.players.IPlayer;
import com.cometproject.api.game.rooms.IRoomComponent;

public interface IPlayerEntity extends IMobileRoomEntity {

    IPlayer getPlayer();

}
