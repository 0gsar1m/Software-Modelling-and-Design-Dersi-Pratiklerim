package creational_patterns.abstract_factory;

public class WindowsCheckBox implements ICheckBox{
    @Override
    public void paint() {
        System.out.println("Windows checkbox painted!");
    }
}
