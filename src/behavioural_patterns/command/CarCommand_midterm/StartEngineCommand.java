package behavioural_patterns.command.CarCommand_midterm;

public class StartEngineCommand implements ICommand {
    private Car car;

    public StartEngineCommand(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.startEngine();
    }
}
