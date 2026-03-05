package SOLID.Liskov.Corrected;

public class Square implements IShape{
    int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public int getArea() {
        return (int) Math.sqrt(side);
    }
}
