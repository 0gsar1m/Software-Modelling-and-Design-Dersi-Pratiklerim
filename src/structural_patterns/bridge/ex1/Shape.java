package structural_patterns.bridge.ex1;

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
