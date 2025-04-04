package org.week05_lab.example02;

import java.util.HashMap;
import java.util.Map;

public class ColorFactory {
    private static final Map<String, Color> colorMap = new HashMap<>();

    public static Color getColor(String colorName) {
        return colorMap.computeIfAbsent(colorName, Color::new);
    }
}
