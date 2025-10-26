package core.basesyntax.strategy.impl;

import core.basesyntax.db.Storage;
import core.basesyntax.strategy.OperationHandler;

public class PurchaseOperation implements OperationHandler {

    @Override
    public void doTransaction(String fruitName, int quantity) {
        int currentQuantity = Storage.getFruitStatus().get(fruitName);
        Storage.getFruitStatus().put(fruitName, currentQuantity - quantity);
    }
}
