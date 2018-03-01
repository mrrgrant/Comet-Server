package com.cometproject.api.game.rooms.models;

import com.cometproject.api.game.rooms.factories.IRoomModelFactory;

public interface IRoomModelService {

    void loadModels();

    IRoomModel getModel(String id);

    IRoomModelFactory getRoomModelFactory();
}
