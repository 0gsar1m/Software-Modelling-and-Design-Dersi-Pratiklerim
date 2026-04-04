package mixed_examples.behavioural_mixed.command_based.command_and_composite;

public class LightOffCommand implements ICommand {
    private Light lights;

    public LightOffCommand(Light lights) {
        this.lights = lights;
    }

    @Override
    public void execute() {
        lights.turnOffLight();
    }
}
