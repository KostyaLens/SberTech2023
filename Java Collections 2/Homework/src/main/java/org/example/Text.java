package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Text {
    public String resetText(String name) {
        String s = "Не верно введено название файла";
        try {
            Path path = Paths.get(name);
            s = Files.readString(path);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return s;
    }
}
