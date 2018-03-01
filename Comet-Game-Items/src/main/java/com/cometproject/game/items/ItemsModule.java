package com.cometproject.game.items;

import com.cometproject.api.config.ModuleConfig;
import com.cometproject.api.modules.BaseModule;
import com.cometproject.api.server.IGameService;

public class ItemsModule extends BaseModule {
    public ItemsModule(ModuleConfig config, IGameService gameService) {
        super(config, gameService);
    }
}
