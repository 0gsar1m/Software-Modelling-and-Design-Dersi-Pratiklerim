package structural_patterns.flyweight.shape_example;

public class Square implements IShape{
    private String intrinsicColor; // Intrinsic state

    public Square(String color) {
        this.intrinsicColor = color;
    }

    @Override
    public void draw(int r) {
        System.out.println("Drawing square with color " + intrinsicColor + " with edge " + r);
    }

    @Override
    public String getName() {
        return intrinsicColor;
    }
}
