package org.example;

import com.github.lalyos.jfiglet.FigletFont;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            String asciiArt = FigletFont.convertOneLine("Hello, World!");
            System.out.println(asciiArt);
        } catch (IOException e) {
            // Hier kannst du Code für die Behandlung der IOException hinzufügen
            e.printStackTrace();
        }
    }

}
