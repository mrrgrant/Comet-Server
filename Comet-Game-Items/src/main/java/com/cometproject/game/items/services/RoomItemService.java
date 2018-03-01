package com.cometproject.game.items.services;

import com.cometproject.api.game.rooms.factories.IRoomItemFactory;
import com.cometproject.api.game.rooms.items.IRoomItem;
import com.cometproject.api.game.rooms.services.IRoomItemService;
import com.cometproject.storage.api.repositories.IRoomItemRepository;
import org.apache.log4j.Logger;

public class RoomItemService implements IRoomItemService {
    private static final Logger log = Logger.getLogger(RoomItemService.class);

    private final IRoomItemRepository roomItemRepository;
    private final IRoomItemFactory roomItemFactory;

    public RoomItemService(IRoomItemFactory roomItemFactory, IRoomItemRepository roomItemRepository) {
        this.roomItemRepository = roomItemRepository;
        this.roomItemFactory = roomItemFactory;
    }

    @Override
    public IRoomItemFactory getItemFactory() {
        return this.roomItemFactory;
    }

    @Override
    public void saveItem(IRoomItem item) {
        // queue shit here.
        this.roomItemRepository.saveItem(item.getData());
    }
}
