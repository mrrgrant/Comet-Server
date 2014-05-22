package com.cometproject.server.game.wired.triggers;

import com.cometproject.server.game.CometManager;
import com.cometproject.server.game.rooms.entities.GenericEntity;
import com.cometproject.server.game.rooms.items.RoomItemFloor;
import com.cometproject.server.game.rooms.types.Room;
import com.cometproject.server.game.wired.data.WiredDataFactory;
import com.cometproject.server.game.wired.data.WiredDataInstance;
import com.cometproject.server.game.wired.misc.WiredSquare;
import com.cometproject.server.game.wired.types.WiredTrigger;
import com.cometproject.server.network.messages.types.Event;

import java.util.List;

public class TimerTrigger extends WiredTrigger {
    @Override
    public void onTrigger(Object data, List<GenericEntity> entities, WiredSquare wiredBlock) {
        if (entities.size() == 0) {
            return;
        }

        Room room = entities.get(0).getRoom();

        for (RoomItemFloor item : room.getItems().getItemsOnSquare(wiredBlock.getX(), wiredBlock.getY())) {
            // TODO: check for condition
            if (CometManager.getWired().isWiredEffect(item)) {
                try {
                    CometManager.getWired().getEffect(item.getDefinition().getInteraction()).onActivate(entities, item);
                    //item.queueInteraction(new InteractionQueueItem(true, item, InteractionAction.ON_TICK, null, 0, 0));
                } catch (Exception ignored) {

                }
            }
        }
    }

    @Override
    public void onSave(Event event, RoomItemFloor item) {
        event.readInt();

        WiredDataInstance instance = WiredDataFactory.get(item);

        if (instance == null) {
            return;
        }

        instance.setDelay(event.readInt());

        WiredDataFactory.save(instance);
    }
}
