package org.example;

import java.time.LocalTime;

import static org.example.Color.*;
import static org.example.Style.*;

@Paint(style = BOLD, color = BLUE)
public class Massages {
    @Paint(style = ITALIC, color = GREEN)
    public String socks(){

        return "У меня порвались носки\u2639";
    }

    private String time(){

        return "Сейчас "+ String.valueOf(LocalTime.now())+" \u231A";
    }
    private String tea(){

        return "Идеальная температура чая - 70\u2103";
    }
    @Paint(style = OKGREEN, color = CYAN)
    public String musik(){

        return "Обычно когда поют открывают рот\u266B";
    }
    @Paint(style = WARNING, color = YELLOW)
    private String warning(){

        return "\u26A0Осторожно! Может ударить током!\u26A1";
    }
}
