package structural_patterns.flyweight.tree_example.violated;

public class Main {
    static void main() {
        //ViolatedMain - or you can call It violated game engine
        System.out.println("--- Starting The Anti-Pattern Forest Generation ---");
        // Let's print just 5 trees and see the disaster
        for (int i = 1; i <= 5; i++) {

            int randomX = (int) (Math.random() * 100);
            int randomY = (int) (Math.random() * 100);

            System.out.println("\nLoop " + i + ": Creating a BRAND NEW tree from scratch...");

            // THE CRASH:
            // We are calling the `new` keyword repeatedly!
            // If the loop runs 1,000,000 times,
            // 1,000,000 Megabytes (1 Terabyte!!!) of RAM will be consumed!
            // The computer will freeze and crash (OutOfMemoryError).
            ViolatedPineTree pineTree= new ViolatedPineTree(randomX, randomY);

            pineTree.draw();
        }
    }
}
