package com.cometproject.game.items.wired;

import com.cometproject.api.config.ModuleConfig;
import com.cometproject.api.game.GameContext;
import com.cometproject.api.modules.BaseModule;
import com.cometproject.api.server.IGameService;
import com.cometproject.game.items.wired.actions.*;
import com.cometproject.game.items.wired.addons.*;
import com.cometproject.game.items.wired.conditions.negative.*;
import com.cometproject.game.items.wired.conditions.positive.*;
import com.cometproject.game.items.wired.triggers.*;

public class WiredModule extends BaseModule {
    public WiredModule(ModuleConfig config, IGameService gameService) {
        super(config, gameService);
    }

    @Override
    public void initialiseGame(GameContext gameContext) {

        // TODO: Register event registries so we don't need to call these item classes from within
        // Comet-Server to execute triggers etc.

        this.registerItem("wf_act_flee", WiredActionFlee.class);//todo: this
        this.registerItem("wf_act_match_to_sshot", WiredActionMatchToSnapshot.class, gameContext);
        this.registerItem("wf_act_teleport_to", WiredActionTeleportPlayer.class, gameContext);
        this.registerItem("wf_act_show_message", WiredActionShowMessage.class, gameContext);
        this.registerItem("wf_act_toggle_state", WiredActionToggleState.class, gameContext);
        this.registerItem("wf_act_give_reward", WiredActionGiveReward.class, gameContext);
        this.registerItem("wf_act_move_rotate", WiredActionMoveRotate.class, gameContext);
        this.registerItem("wf_act_chase", WiredActionChase.class, gameContext);
        this.registerItem("wf_act_kick_user", WiredActionKickUser.class, gameContext);
        this.registerItem("wf_act_reset_timers", WiredActionResetTimers.class, gameContext);
        this.registerItem("wf_act_join_team", WiredActionJoinTeam.class, gameContext);
        this.registerItem("wf_act_leave_team", WiredActionLeaveTeam.class, gameContext);
        this.registerItem("wf_act_give_score", WiredActionGiveScore.class, gameContext);
        this.registerItem("wf_act_bot_talk", WiredActionBotTalk.class, gameContext);
        this.registerItem("wf_act_bot_give_handitem", WiredActionBotGiveHandItem.class, gameContext);
        this.registerItem("wf_act_bot_move", WiredActionBotMove.class, gameContext);
        this.registerItem("wf_act_comet", WiredActionComet.class, gameContext);
        this.registerItem("wf_act_move_to_dir", WiredActionMoveToDirection.class, gameContext);
        this.registerItem("wf_act_bot_talk_to_avatar", WiredActionBotTalkToAvatar.class, gameContext);
        this.registerItem("wf_act_bot_clothes", WiredActionBotClothes.class, gameContext);
        this.registerItem("wf_act_bot_follow_avatar", WiredActionBotFollowAvatar.class, gameContext);
        this.registerItem("wf_act_call_stacks", WiredActionExecuteStacks.class, gameContext);

        this.registerItem("wf_trg_says_something", WiredTriggerPlayerSaysKeyword.class, gameContext);
        this.registerItem("wf_trg_enter_room", WiredTriggerEnterRoom.class, gameContext);
        this.registerItem("wf_trg_periodically", WiredTriggerPeriodically.class, gameContext);
        this.registerItem("wf_trg_walks_off_furni", WiredTriggerWalksOffFurni.class, gameContext);
        this.registerItem("wf_trg_walks_on_furni", WiredTriggerWalksOnFurni.class, gameContext);
        this.registerItem("wf_trg_state_changed", WiredTriggerStateChanged.class, gameContext);
        this.registerItem("wf_trg_game_starts", WiredTriggerGameStarts.class, gameContext);
        this.registerItem("wf_trg_game_ends", WiredTriggerGameEnds.class, gameContext);
        this.registerItem("wf_trg_collision", WiredTriggerCollision.class, gameContext);
        this.registerItem("wf_trg_period_long", WiredTriggerPeriodicallyLong.class, gameContext);
        this.registerItem("wf_trg_at_given_time", WiredTriggerAtGivenTime.class, gameContext);
        this.registerItem("wf_trg_at_given_time_long", WiredTriggerAtGivenTimeLong.class, gameContext);
        this.registerItem("wf_trg_score_achieved", WiredTriggerScoreAchieved.class, gameContext);
        this.registerItem("wf_trg_bot_reached_avtr", WiredTriggerBotReachedAvatar.class, gameContext);

        this.registerItem("wf_cnd_trggrer_on_frn", WiredConditionTriggererOnFurni.class, gameContext);
        this.registerItem("wf_cnd_not_trggrer_on", WiredNegativeConditionTriggererOnFurni.class, gameContext);
        this.registerItem("wf_cnd_actor_in_group", WiredConditionPlayerInGroup.class, gameContext);
        this.registerItem("wf_cnd_not_in_group", WiredNegativeConditionPlayerInGroup.class, gameContext);
        this.registerItem("wf_cnd_furnis_hv_avtrs", WiredConditionFurniHasPlayers.class, gameContext);
        this.registerItem("wf_cnd_not_hv_avtrs", WiredNegativeConditionFurniHasPlayers.class, gameContext);
        this.registerItem("wf_cnd_wearing_badge", WiredConditionPlayerHasBadgeEquipped.class, gameContext);
        this.registerItem("wf_cnd_not_wearing_badge", WiredNegativeConditionPlayerHasBadgeEquipped.class, gameContext);
        this.registerItem("wf_cnd_wearing_effect", WiredConditionPlayerWearingEffect.class, gameContext);
        this.registerItem("wf_cnd_not_wearing_effect", WiredNegativeConditionPlayerWearingEffect.class, gameContext);
        this.registerItem("wf_cnd_has_furni_on", WiredConditionHasFurniOn.class, gameContext);
        this.registerItem("wf_cnd_not_furni_on", WiredNegativeConditionHasFurniOn.class, gameContext);
        this.registerItem("wf_cnd_user_count_in", WiredConditionPlayerCountInRoom.class, gameContext);
        this.registerItem("wf_cnd_not_user_count", WiredConditionPlayerCountInRoom.class, gameContext);
        this.registerItem("wf_cnd_match_snapshot", WiredConditionMatchSnapshot.class, gameContext);
        this.registerItem("wf_cnd_not_match_snap", WiredNegativeConditionMatchSnapshot.class, gameContext);
        this.registerItem("wf_cnd_has_handitem", WiredConditionHasHandItem.class, gameContext);
        this.registerItem("wf_cnd_time_more_than", WiredConditionTimeMoreThan.class, gameContext);
        this.registerItem("wf_cnd_time_less_than", WiredConditionTimeLessThan.class, gameContext);
        this.registerItem("wf_cnd_actor_in_team", WiredConditionPlayerInTeam.class, gameContext);
        this.registerItem("wf_cnd_stuff_is", WiredConditionStuffIs.class, gameContext);
        this.registerItem("wf_cnd_not_stuff_is", WiredNegativeConditionStuffIs.class, gameContext);

        this.registerItem("wf_xtra_random", WiredAddonRandomEffect.class, gameContext);
        this.registerItem("wf_xtra_unseen", WiredAddonUnseenEffect.class, gameContext);

        this.registerItem("wf_floor_switch1", WiredAddonFloorSwitch.class, gameContext);
        this.registerItem("wf_floor_switch2", WiredAddonFloorSwitch.class, gameContext);
        this.registerItem("wf_colorwheel", WiredAddonColourWheel.class, gameContext);
        this.registerItem("wf_pressureplate", WiredAddonPressurePlate.class, gameContext);
        this.registerItem("wf_arrowplate", WiredAddonPressurePlate.class, gameContext);
        this.registerItem("wf_ringplate", WiredAddonPressurePlate.class, gameContext);
        this.registerItem("wf_pyramid", WiredAddonPyramid.class, gameContext);
        this.registerItem("wf_visual_timer", WiredAddonVisualTimer.class, gameContext);
        this.registerItem("wf_blob", WiredAddonBlob.class, gameContext);
    }

}
