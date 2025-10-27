package core.basesyntax.service.impl;

import core.basesyntax.service.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileWriterImpl implements FileWriter {

    @Override
    public void write(String resultingReport, String fileName) {
        Path path = Paths.get(fileName);
        try {
            Files.writeString(path, resultingReport, StandardOpenOption.CREATE);
        } catch (IOException e) {
            throw new RuntimeException("failed to save file: "
                    + fileName + " on path: " + fileName, e);
        }
    }
}
