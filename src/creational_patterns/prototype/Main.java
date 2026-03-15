package creational_patterns.prototype;

public class Main {
    static void main() {
        //ColorStore colorStore = new ColorStore(); - (if u don't identify the method getColorByName() as static,
                                                    // method will depend on a ColorStore object

        //If u define it static, Calling class like ColorStore.xxx below will be enough
        Color c1 = ColorStore.getColorByName("blue");


    }
}
