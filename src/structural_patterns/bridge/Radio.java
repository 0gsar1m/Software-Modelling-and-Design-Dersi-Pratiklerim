package structural_patterns.bridge;

public class Radio implements IDevice{
    @Override
    public void turnOn() { System.out.println("Radio Turned On"); }

    @Override
    public void turnOff() { System.out.println("Radio Turned Off"); }
}
