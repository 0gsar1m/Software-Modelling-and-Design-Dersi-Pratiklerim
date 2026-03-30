package structural_patterns.bridge.ex1;

public class RasterRenderer implements IRenderer{
    private Shape shape;

    @Override
    public void render(String shapeName) {
        System.out.println("Rendering shape: " + shapeName + " with RasterRenderer");
    }
}
