package com.cometproject.storage.mysql.queues.items;

import com.cometproject.api.game.rooms.objects.IFloorItem;
import com.cometproject.storage.mysql.BlockingMySQLStorageQueue;
import com.cometproject.storage.mysql.MySQLConnectionProvider;

import java.sql.PreparedStatement;

public class ItemDataUpdateQueue extends BlockingMySQLStorageQueue<Long, IFloorItem> {

    public ItemDataUpdateQueue(MySQLConnectionProvider connectionProvider) {
        super(connectionProvider, "UPDATE items SET extra_data = ? WHERE id = ?;", 25);
    }

    @Override
    public void processBatch(PreparedStatement preparedStatement, Long id, IFloorItem object) throws Exception {
        preparedStatement.setString(1, object.getDataObject());
        preparedStatement.setLong(2, id);

        preparedStatement.addBatch();
    }
}
