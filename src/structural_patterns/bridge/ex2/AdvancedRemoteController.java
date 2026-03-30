package structural_patterns.bridge.ex2;

public class AdvancedRemoteController extends BaseRemoteControl{
    // if super wasnt existed, BaseRemoteControl(father) constructor wouldnt be active so
    //@override methods in concrete remote controllers (a,b,c extends BaseRemoteControl)
    //wouldn't exist either.

    public AdvancedRemoteController(IDevice device) {
        super(device);
    }

    @Override
    public void togglePower() {
        System.out.println("ADVANCED remote power toggled.");
        device.turnOn();
    }

    //advanced remote's native methods
    public void mute() {
        System.out.println("Device muted.");
    }
    public void openYouTube() {
        System.out.println("Opening YouTube..");
    }
    public void openTabii() {
        System.out.println("Opening Tabii..");
    }
}
