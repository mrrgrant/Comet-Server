package com.cometproject.game.rooms.types.components;

import com.cometproject.api.game.rooms.RoomContext;
import com.cometproject.api.game.rooms.components.IEntityComponent;
import com.cometproject.api.game.rooms.entities.IBotEntity;
import com.cometproject.api.game.rooms.entities.IPlayerEntity;
import com.cometproject.api.game.rooms.entities.IRoomEntity;
import com.cometproject.api.game.rooms.factories.IRoomEntityFactory;
import com.cometproject.api.networking.messages.IMessageComposer;
import com.google.common.collect.Maps;

import java.util.Map;

public class EntityComponent implements IEntityComponent {
    private final RoomContext roomContext;

    private final Map<Integer, IRoomEntity> roomEntities;

    private final Map<Integer, IPlayerEntity> playerEntities;
    private final Map<Integer, IBotEntity> botEntities;

    private final IRoomEntityFactory roomEntityFactory;

    public EntityComponent(RoomContext roomContext, IRoomEntityFactory roomEntityFactory) {
        this.roomContext = roomContext;
        this.roomEntityFactory = roomEntityFactory;

        this.roomEntities = Maps.newConcurrentMap();
        this.playerEntities = Maps.newConcurrentMap();
        this.botEntities = Maps.newConcurrentMap();
    }

    @Override
    public RoomContext getContext() {
        return this.roomContext;
    }

    @Override
    public void broadcast(IMessageComposer messageComposer) {
        for (final IPlayerEntity playerEntity : this.playerEntities.values()) {
            playerEntity.getPlayer().getSession().send(messageComposer);
        }
    }
}
