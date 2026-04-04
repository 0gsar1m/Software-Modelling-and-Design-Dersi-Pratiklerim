package mixed_examples.behavioural_mixed.command_based.command_and_composite;

public class LightOnCommand implements ICommand {
    private Light lights;

    public LightOnCommand(Light lights) {
        this.lights = lights;
    }

    @Override
    public void execute() {
        lights.turnOnLight();
    }
}
