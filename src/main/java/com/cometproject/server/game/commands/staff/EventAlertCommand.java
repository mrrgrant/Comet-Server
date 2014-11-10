package com.cometproject.server.game.commands.staff;

import com.cometproject.server.boot.Comet;
import com.cometproject.server.config.Locale;
import com.cometproject.server.game.commands.ChatCommand;
import com.cometproject.server.network.messages.outgoing.notification.AdvancedAlertMessageComposer;
import com.cometproject.server.network.sessions.Session;

public class EventAlertCommand extends ChatCommand {
    @Override
    public void execute(Session client, String[] params) {
        if (params.length == 0) {
            return;
        }

        Comet.getServer().getNetwork().getSessions().broadcast(
                AdvancedAlertMessageComposer.compose(
                        Locale.get("command.eventalert.alerttitle"),
                        this.merge(params) + "<br><br><i> " + client.getPlayer().getData().getUsername() + "</i>",
                        Locale.get("command.eventalert.buttontitle"), "event:navigator/goto/" + client.getPlayer().getEntity().getRoom().getId(), "game_promo_small"));
    }

    @Override
    public String getPermission() {
        return "eventalert_command";
    }

    @Override
    public String getDescription() {
        return Locale.get("command.eventalert.description");
    }
}