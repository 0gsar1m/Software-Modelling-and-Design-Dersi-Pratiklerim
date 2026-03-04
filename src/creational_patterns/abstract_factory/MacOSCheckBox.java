package creational_patterns.abstract_factory;

public class MacOSCheckBox implements ICheckBox{
    @Override
    public void paint() {
        System.out.println("MacOS checkbox painted!");
    }
}
