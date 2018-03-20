package com.cometproject.game.rooms.pathfinding;

import com.cometproject.api.config.ModuleConfig;
import com.cometproject.api.modules.BaseModule;
import com.cometproject.api.server.IGameService;

public class PathfinderModule extends BaseModule {

    public PathfinderModule(ModuleConfig config, IGameService gameService) {
        super(config, gameService);
    }

    @Override
    public void setup() {

    }
}
