package com.cometproject.api.game.rooms.factories;

import com.cometproject.api.game.rooms.models.IRoomModel;
import com.cometproject.api.game.rooms.models.InvalidModelException;
import com.cometproject.api.game.rooms.models.RoomModelData;

public interface IRoomModelFactory {

    IRoomModel createModel(RoomModelData roomModelData) throws InvalidModelException;

}
