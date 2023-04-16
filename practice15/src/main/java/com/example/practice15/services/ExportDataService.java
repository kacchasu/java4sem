package com.example.practice15.services;

import com.example.practice15.repositories.ManufactureRepository;
import com.example.practice15.repositories.PhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@Service
public class ExportDataService {

    @Autowired
    private PhoneRepository phoneRepository;

    @Autowired
    private ManufactureRepository manufactureRepository;

    private final String directoryPath = "output_directory";

    public void exportDataToFile() {
        try {
            Files.createDirectories(Paths.get(directoryPath));
            Files.walk(Paths.get(directoryPath)).filter(Files::isRegularFile).map(Path::toFile).forEach(File::delete);

            saveEntitiesToFile(directoryPath + "/phones.txt", phoneRepository.findAll());
            saveEntitiesToFile(directoryPath + "/manufactures.txt", manufactureRepository.findAll());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private <T> void saveEntitiesToFile(String filePath, List<T> entities) throws IOException {
        try (FileWriter writer = new FileWriter(filePath)) {
            for (T entity : entities) {
                writer.write(entity.toString() + System.lineSeparator());
            }
        }
    }
}
