package org.example;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IO implements FilleInterface{
    @Override
    public void writeFile(String name, String str) {
        try {
            FileWriter fileWriter = new FileWriter(name);
            fileWriter.write(str);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String readFile(String name) {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            FileReader fileReader = new FileReader(name);
            int ch ;
            while ((ch = fileReader.read()) != -1) {
                stringBuilder.append((char) ch);
            }
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }

}
