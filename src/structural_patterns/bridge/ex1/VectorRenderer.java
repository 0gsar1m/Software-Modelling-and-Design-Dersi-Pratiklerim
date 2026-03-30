package structural_patterns.bridge.ex1;

public class VectorRenderer implements IRenderer{
    @Override
    public void render(String shapeName) {
        System.out.println("Rendering shape: " + shapeName + " with VectorRenderer");
    }
}
