package creational_patterns.abstract_factory;

public interface IGUIFactory {
    IButton createButton();
    ICheckBox createCheckBox();
}
