package creational_patterns.abstract_factory;

public class WindowsFactory implements IGUIFactory {

    @Override
    public IButton createButton() {
        System.out.println("created new WindowsButton() obj.");
        return new WindowsButton();
    }

    @Override
    public ICheckBox createCheckBox() {
        System.out.println("created new WindowsCheckBox() obj.");
        return new WindowsCheckBox();
    }
}
