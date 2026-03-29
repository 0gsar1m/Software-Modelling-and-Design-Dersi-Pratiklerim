package structural_patterns.bridge.renderExample;

public abstract class Shape {
    protected IRenderer renderer;
    private String shapeName;

    public Shape(IRenderer renderer){
        this.renderer = renderer;
    }

    public abstract void drawShape();

    public String getShapeName(){
        return shapeName;
    }
}
