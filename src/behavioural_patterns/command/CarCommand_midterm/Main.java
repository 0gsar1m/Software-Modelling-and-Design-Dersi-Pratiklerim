package behavioural_patterns.command.CarCommand_midterm;

public class Main {
    static void main() {
        Car car = new Car();

        StartEngineCommand startEngine = new StartEngineCommand(car);
        StopEngineCommand stopEngine = new StopEngineCommand(car);

        startEngine.execute();
        stopEngine.execute();
    }
}
