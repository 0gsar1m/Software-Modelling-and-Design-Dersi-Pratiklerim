package structural_patterns.bridge.renderExample;

public class Triangle extends Shape{

    public Triangle(IRenderer renderer) {
        super(renderer);
    }

    @Override
    public void drawShape() {
        renderer.render("Triangle");
    }
}
