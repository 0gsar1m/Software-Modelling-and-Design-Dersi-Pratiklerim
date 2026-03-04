package creational_patterns.abstract_factory;

public class Main {
    static void main() {
        IGUIFactory factoryType;

        String osType = "windows";

        if(osType.equalsIgnoreCase("windows")){
            factoryType = new WindowsFactory();
        }else{
            factoryType = new MacOSFactory();
        }

        IButton windowsButton = factoryType.createButton();
        ICheckBox windowsCheckBox = factoryType.createCheckBox();
        System.out.println("--------------------------------");
        windowsButton.paint();
        windowsCheckBox.paint();
    }
}
