package com.cometproject.api.game.rooms.services;

import com.cometproject.api.game.rooms.factories.IRoomModelFactory;
import com.cometproject.api.game.rooms.models.IRoomModel;

public interface IRoomModelService {

    void loadModels();

    IRoomModel getModel(String id);

    IRoomModelFactory getRoomModelFactory();
}
