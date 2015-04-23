package com.cometproject.server.network.messages.outgoing.user.achievements;

import com.cometproject.server.network.messages.composers.MessageComposer;
import com.cometproject.server.network.messages.headers.Composers;
import com.cometproject.server.network.messages.types.Composer;


public class AchievementPointsMessageComposer extends MessageComposer {
    private final int points;

    public AchievementPointsMessageComposer(final int points) {
        this.points = points;
    }

    @Override
    public short getId() {
        return Composers.AchievementPointsMessageComposer;
    }

    @Override
    public void compose(Composer msg) {
        msg.writeInt(this.points);
    }
}