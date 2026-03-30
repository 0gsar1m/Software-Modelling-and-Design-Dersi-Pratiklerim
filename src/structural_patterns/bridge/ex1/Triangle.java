package structural_patterns.bridge.ex1;

public class Triangle extends Shape{

    public Triangle(IRenderer renderer) {
        super(renderer);
    }

    @Override
    public void drawShape() {
        renderer.render("Triangle");
    }
}
