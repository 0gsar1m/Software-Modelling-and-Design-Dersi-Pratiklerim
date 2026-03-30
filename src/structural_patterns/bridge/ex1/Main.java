package structural_patterns.bridge.ex1;

public class Main {
    static void main() {

        IRenderer vectorApi = new VectorRenderer();
        IRenderer rasterApi = new RasterRenderer();

        Triangle triangle = new Triangle(vectorApi);
        triangle.drawShape();
    }
}
