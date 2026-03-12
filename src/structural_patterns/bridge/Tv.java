package structural_patterns.bridge;

public class Tv implements IDevice{
    @Override
    public void turnOn() { System.out.println("TV Turned On"); }

    @Override
    public void turnOff() { System.out.println("TV Turned Off"); }
}
