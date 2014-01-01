package com.cometsrv.game.items.interactions;

import com.cometsrv.game.rooms.avatars.Avatar;
import com.cometsrv.game.rooms.items.FloorItem;

public abstract class Interactor {
    /*
     * State: user is walking on or off furni (true = on, false = off)
     * Item: the interacting item
     * Avatar: the interacting avatar
     */
    public abstract InteractionState onWalk(boolean state, FloorItem item, Avatar avatar);

    /*
     * State: ???
     * Item: the interacting item
     * Avatar: the interacting avatar
     */
    public abstract InteractionState onInteract(int request, FloorItem item, Avatar avatar);

    public abstract InteractionState onPlace(FloorItem item, Avatar avatar);

    public abstract InteractionState onPickup(FloorItem item, Avatar avatar);

    public abstract InteractionState onTick(FloorItem item, Avatar avatar);

    public abstract boolean requiresRights();
}
