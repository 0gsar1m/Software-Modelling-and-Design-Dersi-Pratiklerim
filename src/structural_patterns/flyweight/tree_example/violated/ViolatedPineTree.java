package structural_patterns.flyweight.tree_example.violated;

public class ViolatedPineTree {
    // THE CRASH REASON:
    // This heavy 1MB texture is being duplicated for EVERY SINGLE TREE!
    private byte[] heavyTexture;

    // Extrinsic states are WRONGLY embedded directly inside the object.
    private int x;
    private int y;

    public ViolatedPineTree(int x, int y) {
        this.x = x;
        this.y = y;

        this.heavyTexture = new byte[1000000]; //   1MB = 1.000.000 byte
        System.out.println("--> [FATAL] Loading 1MB texture into RAM over and over again!");

    }

    public void draw() {
        System.out.println("Drawing Pine Tree at coordinates: X=" + x + ", Y=" + y);
    }


}
