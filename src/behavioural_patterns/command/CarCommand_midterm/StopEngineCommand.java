package behavioural_patterns.command.CarCommand_midterm;

public class StopEngineCommand implements ICommand {
    private Car car;

    public StopEngineCommand(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.stopEngine();
    }
}
