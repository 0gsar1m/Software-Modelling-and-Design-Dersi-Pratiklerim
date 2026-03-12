package structural_patterns.bridge;

public class StandardRemoteController extends BaseRemoteControl{
    // if super wasn't existed, BaseRemoteControl(father) constructor wouldn't be active so
    //@override methods in concrete remote controllers (a,b,c extends BaseRemoteControl)
    //wouldn't exist either.

    public StandardRemoteController(IDevice device) {
        super(device);
    }

    @Override
    public void togglePower() {
        System.out.println("STANDARD remote power toggled.");
        device.turnOn();
    }
    public void mute() {
        System.out.println("Device muted.");
    }
}
