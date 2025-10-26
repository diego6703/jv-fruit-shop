package core.basesyntax.service.impl;

import core.basesyntax.model.Constants;
import core.basesyntax.service.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileReaderImpl implements FileReader {

    @Override
    public List<String> read(String fileName) {
        String filePath = Constants.RESOURCE_PATH + fileName;
        List<String> result = List.of();
        try (Stream<String> lines = Files.lines(Paths.get(filePath))) {
            result = lines.skip(1).collect(Collectors.toList());
        } catch (IOException e) {
            System.out.println("Can't find file on path: " + filePath);
            ;
        }
        return result;
    }
}
