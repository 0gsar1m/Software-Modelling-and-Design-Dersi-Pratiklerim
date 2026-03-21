package structural_patterns.flyweight.tree_example.fixed;

public class Main {
    static void main() {
        System.out.println("--- Starting The Optimized Flyweight Forest Generation ---");

        for (int i = 1; i <= 5; i++) {

            System.out.println("\nLoop " + i + ": Asking Factory for a Pine tree...");

            int randomX = (int) (Math.random() * 100);
            int randomY = (int) (Math.random() * 100);

            // The Client (Main) NO LONGER USES THE `new` KEYWORD!
            // It asks the Factory for an object. If the loop runs 1 Million times,
            // RAM usage stays at 1 MB instead of jumping to 1 Terabyte.
            ITree pineTree = TreeFactory.getTree("Pine tree");
            pineTree.draw(randomX, randomY);
        }
    }
}
