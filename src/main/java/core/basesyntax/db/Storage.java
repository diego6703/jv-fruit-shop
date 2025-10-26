package core.basesyntax.db;

import java.util.HashMap;

public class Storage {
    private static final HashMap<String, Integer> fruitStatus = new HashMap<>();

    public static HashMap<String, Integer> getFruitStatus() {
        return fruitStatus;
    }

}
