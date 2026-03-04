package creational_patterns.abstract_factory;

public class MacOSFactory implements IGUIFactory{
    @Override
    public IButton createButton() {
        System.out.println("created new MacOSButton() obj.");
        return new MacOSButton();
    }

    @Override
    public ICheckBox createCheckBox() {
        System.out.println("created new MacOSCheckBox() obj.");
        return new MacOSCheckBox();
    }
}
