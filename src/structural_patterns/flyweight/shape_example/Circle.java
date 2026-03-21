package structural_patterns.flyweight.shape_example;

public class Circle implements IShape {

    private String intrinsicColor; // Intrinsic state

    public Circle(String color) {
        this.intrinsicColor = color;
    }

    @Override
    public void draw(int r) {
        System.out.println("Drawing circle with color " + intrinsicColor + " with radius " + r);
    }

    @Override
    public String getName() {
        return intrinsicColor;
    }
}
