package structural_patterns.flyweight.tree_example.fixed;

public class PineTree implements ITree {

    // DIVERGENCE:
    // Only Intrinsic State (heavy and constant) remains inside the object.
    // The "x and y" variables have been completely DELETED from the class scope.

    private byte[] heavyTexture;

    public PineTree(byte[] heavyTexture){
        this.heavyTexture = heavyTexture;
        System.out.println("--> HEAVY DB CALL: Loading 1MB texture into RAM!"); //It'll be fetched to RAM
                                                                                  // when we say "new PineTree(...)"
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("Drawing Pine Tree [Texture loaded] at coordinates: X=" + x + ", Y=" + y);
    }
}
