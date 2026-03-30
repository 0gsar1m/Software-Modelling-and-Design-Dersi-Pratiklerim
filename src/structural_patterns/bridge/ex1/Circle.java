package structural_patterns.bridge.ex1;

public class Circle extends Shape{
    private float raidus = 0.5f;

    public Circle(IRenderer renderer) {
        super(renderer);
    }

    @Override
    public void drawShape() {
        renderer.render("Circle");
    }
}
