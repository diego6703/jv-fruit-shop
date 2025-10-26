package core.basesyntax.db;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Storage {
    private static final HashMap<String, Integer> fruitStatus = new HashMap<>();

    public static void setFruitQuantity(String fruitName, int quantity) {
        fruitStatus.put(fruitName, quantity);
    }

    public static void addFruitQuantity(String fruitName, int quantity) {
        int currentQuantity = fruitStatus.get(fruitName);
        fruitStatus.put(fruitName, currentQuantity + quantity);
    }

    public static void substractFruitQuantity(String fruitName, int quantity) {
        int currentQuantity = fruitStatus.get(fruitName);
        fruitStatus.put(fruitName, currentQuantity - quantity);
    }

    public static Collection<Map.Entry<String, Integer>> getFullStorage() {
        return fruitStatus.entrySet();
    }
}
