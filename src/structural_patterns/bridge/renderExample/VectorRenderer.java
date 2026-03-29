package structural_patterns.bridge.renderExample;

public class VectorRenderer implements IRenderer{
    @Override
    public void render(String shapeName) {
        System.out.println("Rendering shape: " + shapeName + " with VectorRenderer");
    }
}
