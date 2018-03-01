package com.cometproject.api.game.rooms.items;

import com.cometproject.api.game.rooms.objects.data.RoomItemData;

public interface IRoomItem {

    long getId();

    int getVirtualId();

    RoomItemData getData();

}
