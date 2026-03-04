package creational_patterns.abstract_factory;

public class WindowsButton implements IButton{
    @Override
    public void paint() {
        System.out.println("Windows button painted!");
    }
}
