package com.cometproject.server.game.permissions.types;

import java.sql.ResultSet;
import java.sql.SQLException;


public class CommandPermission {
    public enum RoomRights {
        OWNER,
        RIGHTS,
        NONE;
    }

    private final String commandId;

    private final int minimumRank;
    private final boolean vipOnly;
    private final RoomRights rights;
    public CommandPermission(String commandId, int minimumRank, boolean vipOnly, RoomRights rights) {
        this.commandId = commandId;
        this.minimumRank = minimumRank;
        this.vipOnly = vipOnly;
        this.rights = rights;
    }

    public String getCommandId() {
        return commandId;
    }

    public int getMinimumRank() {
        return minimumRank;
    }

    public boolean vipOnly() {
        return vipOnly;
    }

    public RoomRights getRightsOverride() {
        return rights;
    }
}
