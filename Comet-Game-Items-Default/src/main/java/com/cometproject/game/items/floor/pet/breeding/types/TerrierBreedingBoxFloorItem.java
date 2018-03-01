package com.cometproject.game.items.floor.pet.breeding.types;

import com.cometproject.api.game.rooms.objects.data.RoomItemData;
import com.cometproject.server.game.pets.races.PetType;
import com.cometproject.game.items.floor.pet.breeding.BreedingBoxFloorItem;
import com.cometproject.server.game.rooms.types.Room;

public class TerrierBreedingBoxFloorItem extends BreedingBoxFloorItem {
    public TerrierBreedingBoxFloorItem(RoomItemData itemData, Room room) {
        super(itemData, room);
    }

    @Override
    protected int getBabyType() {
        return PetType.BABYTERRIER;
    }

    @Override
    protected int getPetType() {
        return PetType.TERRIER;
    }
}
