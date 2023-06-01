package org.example;

import org.junit.Assert;

import static org.junit.Assert.*;

public class NIOandIOTest {

    @org.junit.Test
    public void writeFileIO() {
        FilleInterface io = new IO();
        String str = "Тест1";
        io.writeFile("Test1.txt", str);
        String ioStr = io.readFile("Test1.txt");
        Assert.assertEquals(str, ioStr);
    }

    @org.junit.Test
    public void readFileIO() {
        FilleInterface io = new IO();
        String str = "Тест2";
        String ioStr = io.readFile("Test2.txt");
        Assert.assertEquals(str, ioStr);
    }
    @org.junit.Test
    public void writeFileNIO() {
        FilleInterface nio = new NIO();
        String str = "Тест3";
        nio.writeFile("Test3.txt", str);
        String ioStr = nio.readFile("Test3.txt");
        Assert.assertEquals(str, ioStr);
    }

    @org.junit.Test
    public void readFileNIO() {
        FilleInterface nio = new NIO();
        String str = "Тест4";
        String ioStr = nio.readFile("Test4.txt");
        Assert.assertEquals(str, ioStr);
    }
}