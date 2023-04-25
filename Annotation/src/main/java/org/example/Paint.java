package org.example;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

class Color{
    public static final String RESET = "\u001B[0m";
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";

}

class Style{
    public static final String HEADER = "\033[95m";
    public static final String OKBLUE = "\033[94m";
    public static final String OKCYAN = "\033[96m";
    public static final String OKGREEN = "\033[92m";
    public static final String WARNING = "\033[93m";
    public static final String FAIL = "\033[91m";
    public static final String ENDC = "\033[0m";
    public static final String BOLD = "\033[1m";
    public static final String UNDERLINE = "\033[4m";
    public static final String ITALIC = "\033[3m";
}
@Retention(RetentionPolicy.RUNTIME)
public @interface Paint {
    String color();
    String style();
}
