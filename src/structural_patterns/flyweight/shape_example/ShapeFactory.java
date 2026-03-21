package structural_patterns.flyweight.shape_example;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class ShapeFactory {

    private static final Map<String,IShape> shapeMap = new HashMap<>();

    public static IShape getShape(String key, Supplier<IShape> ureticiTarifi){

        //If exists:
        IShape shape = shapeMap.get(key);
        if (shape != null) System.out.println(key + " exists");
        //If not:
        if (shape == null){
            System.out.println("Asked shape does not exists, creating by 'ureticiTarifi'");
            shape = ureticiTarifi.get(); // ureticiTarifi is a lambda expression, this line will use it from parameter.
            shapeMap.put(key, shape);
            System.out.println("Creating circle of color : " + key);
        }
        return shape;
    }
}
