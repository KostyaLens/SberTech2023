package org.example;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NIO implements  FilleInterface{
    @Override
    public void writeFile(String name, String str) {
        Path path = Paths.get(name);
        try {
            Files.write(path, str.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String readFile(String name) {
        String str = "";
        Path path = Paths.get(name);
        try {
            str = Files.readString(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
}
