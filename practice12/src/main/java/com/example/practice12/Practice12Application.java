package com.example.practice12;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@SpringBootApplication
public class Practice12Application {
    static BufferedWriter writer;
    static BufferedReader reader;
    static Path filePath;

    @PostConstruct
    public void init() throws IOException {
        int character;
        while((character = reader.read()) != -1) {
            writer.write(character);
        }
        reader.close();
        writer.close();
    }

    @PreDestroy
    public void destroy() throws IOException {
        Files.delete(filePath.toAbsolutePath());
    }

    public static void main(String[] args) throws IOException {
        writer = new BufferedWriter(new FileWriter(args[1]));
        reader = new BufferedReader(new FileReader(args[0]));
        filePath = Paths.get(args[0]);

        SpringApplication.run(Practice12Application.class, args);
    }

}
