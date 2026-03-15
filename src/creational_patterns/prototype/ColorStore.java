package creational_patterns.prototype;

import java.util.HashMap;
import java.util.Map;

public class ColorStore {
    private static Map<String, Color> colorMap = new HashMap<>();

    static {
        colorMap.put("blue", new BlueColor());
        colorMap.put("black", new BlackColor());
    }

    public static Color getColorByName(String colorName){
        System.out.println("Getting color: " + colorName);
        return (Color) colorMap.get(colorName).clone();
    }
}
