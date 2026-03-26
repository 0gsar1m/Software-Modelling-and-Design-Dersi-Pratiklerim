package behavioural_patterns.command.RemoteLight;

public class TurnOffCommand implements ICommand{
    private Light light;

    public TurnOffCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }

    @Override
    public void undo() {
        light.turnOn();
    }
}
