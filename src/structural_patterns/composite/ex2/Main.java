package structural_patterns.composite.ex2;

public class Main {
    static void main() {
        Container mainBox = new Container("Main Deploy");
        Container subBox = new Container("Electronics");

        subBox.addToContainer(new SinglePackage("Keyboard", 1.2));
        subBox.addToContainer(new SinglePackage("Mouse", 0.3));

        mainBox.addToContainer(subBox);
        mainBox.addToContainer(new SinglePackage("Sırt Çantası", 0.8));
        System.out.println("--- CARGO DETAILS ---");
        mainBox.showDetails();
    }
}
