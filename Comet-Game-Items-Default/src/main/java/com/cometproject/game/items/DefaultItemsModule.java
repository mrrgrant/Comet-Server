package com.cometproject.game.items;

import com.cometproject.api.config.ModuleConfig;
import com.cometproject.api.game.GameContext;
import com.cometproject.api.modules.BaseModule;
import com.cometproject.api.server.IGameService;
import com.cometproject.game.items.floor.*;
import com.cometproject.game.items.floor.boutique.MannequinFloorItem;
import com.cometproject.game.items.floor.hollywood.HaloTileFloorItem;
import com.cometproject.game.items.floor.summer.SummerShowerFloorItem;

public class DefaultItemsModule extends BaseModule {
    public DefaultItemsModule(ModuleConfig config, IGameService gameService) {
        super(config, gameService);
    }

    @Override
    public void initialiseGame(GameContext gameContext) {
        this.registerItem("roller", RollerFloorItem.class, gameContext);
        this.registerItem("dice", DiceFloorItem.class, gameContext);
        this.registerItem("teleport", TeleporterFloorItem.class, gameContext);
        this.registerItem("teleport_door", TeleporterFloorItem.class, gameContext);
        this.registerItem("teleport_pad", TeleportPadFloorItem.class, gameContext);
        this.registerItem("onewaygate", OneWayGateFloorItem.class, gameContext);
        this.registerItem("gate", GateFloorItem.class, gameContext);
        this.registerItem("roombg", BackgroundTonerFloorItem.class, gameContext);
        this.registerItem("bed", BedFloorItem.class, gameContext);
        this.registerItem("vendingmachine", VendingMachineFloorItem.class, gameContext);
        this.registerItem("mannequin", MannequinFloorItem.class, gameContext);
        this.registerItem("beach_shower", SummerShowerFloorItem.class, gameContext);
        this.registerItem("halo_tile", HaloTileFloorItem.class, gameContext);
        this.registerItem("adjustable_height_seat", AdjustableHeightSeatFloorItem.class, gameContext);
        this.registerItem("adjustable_height", AdjustableHeightFloorItem.class, gameContext);
        this.registerItem("lovelock", LoveLockFloorItem.class, gameContext);
        this.registerItem("soundmachine", SoundMachineFloorItem.class, gameContext);
        this.registerItem("privatechat", PrivateChatFloorItem.class, gameContext);
        this.registerItem("badge_display", BadgeDisplayFloorItem.class, gameContext);
    }
}
