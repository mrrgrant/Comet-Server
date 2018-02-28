package com.cometproject.api.game.rooms;

import com.cometproject.api.game.GameContext;

public class RoomContext {
    private final GameContext gameContext;
    private final IRoomData roomData;

    private IRoom room;

    public RoomContext(GameContext gameContext, IRoomData roomData) {
        this.gameContext = gameContext;
        this.roomData = roomData;
    }

    public IRoom getRoom() {
        return room;
    }

    public void setRoom(IRoom room) {
        this.room = room;
    }

    public GameContext getGameContext() {
        return gameContext;
    }

    public IRoomData getRoomData() {
        return roomData;
    }
}
