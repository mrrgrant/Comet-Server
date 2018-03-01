package com.cometproject.game.items.factories;

import com.cometproject.api.game.furniture.types.FurnitureDefinition;
import com.cometproject.api.game.rooms.factories.IRoomItemFactory;
import com.cometproject.api.game.rooms.items.IRoomItem;
import com.cometproject.api.game.rooms.objects.data.RoomItemData;
import com.google.common.collect.Maps;
import org.apache.log4j.Logger;

import java.util.Map;

public class RoomItemFactory implements IRoomItemFactory {
    private static final Logger log = Logger.getLogger(RoomItemFactory.class);

    private final Map<String, Class<? extends IRoomItem>> classRegistry;

    public RoomItemFactory() {
        this.classRegistry = Maps.newConcurrentMap();
    }

    @Override
    public void registerType(String interactionType, Class<? extends IRoomItem> itemClass) {
        this.classRegistry.put(interactionType, itemClass);
        log.debug("Registered item type \"" + interactionType + "\", " + itemClass.getSimpleName());
    }

    @Override
    public IRoomItem createRoomItem(RoomItemData roomItemData, FurnitureDefinition furnitureDefinition) throws Exception {
        final Class<? extends IRoomItem> clazz = this.classRegistry.get(furnitureDefinition.getInteraction());
        return null;
    }
}
