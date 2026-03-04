package creational_patterns.abstract_factory;

public class MacOSButton implements IButton{
    @Override
    public void paint() {
        System.out.println("MacOS button painted!");
    }
}
