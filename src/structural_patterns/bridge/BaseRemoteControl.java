package structural_patterns.bridge;

public abstract class BaseRemoteControl {
    //here is the bridge part, It swallows a DIFFERENT FAMILY of abstraction/interface
    protected IDevice device;

    public BaseRemoteControl(IDevice device){
        this.device = device;
    }

    public abstract void togglePower();
}
