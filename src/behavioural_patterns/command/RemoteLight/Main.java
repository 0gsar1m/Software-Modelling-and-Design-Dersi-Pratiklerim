package behavioural_patterns.command.RemoteLight;

public class Main {
    static void main() {

        Light light = new Light();
        RemoteController remote = new RemoteController();

        ICommand turnOnCommand = new TurnOnCommand(light);
        ICommand turnOffCommand = new TurnOffCommand(light);

        remote.setCommand(turnOnCommand);
        remote.pressButon();

        remote.setCommand(turnOffCommand);
        remote.pressButon();

    }
}
