package core.basesyntax.service.impl;

import core.basesyntax.model.Constants;
import core.basesyntax.model.FruitTransaction;
import core.basesyntax.service.DataConverter;
import java.util.ArrayList;
import java.util.List;

public class DataConverterImpl implements DataConverter {

    @Override
    public List<FruitTransaction> convertToTransaction(List<String> list) {
        List<FruitTransaction> fruitTransactions = new ArrayList<>();
        for (String line : list) {
            String[] singleTransaction = line.split(Constants.COMA_SEPARATOR);
            if (singleTransaction.length == 3) {
                fruitTransactions.add(new FruitTransaction(
                        FruitTransaction.Operation.fromCode(singleTransaction[0]),
                        singleTransaction[1],
                        Integer.parseInt(singleTransaction[2].trim())));
            }
        }
        return fruitTransactions;
    }
}
