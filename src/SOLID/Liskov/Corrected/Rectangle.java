package SOLID.Liskov.Corrected;

public class Rectangle implements IShape {
    protected int height;
    protected int width;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public int getArea() {
        return height * width;
    }
}
