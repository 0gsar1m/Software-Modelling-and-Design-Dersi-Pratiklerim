package mixed_examples.behavioural_mixed.command_based.command_and_composite;

public class UnlockDoorCommand implements ICommand{
    private Door doors;

    public UnlockDoorCommand(Door doors) {
        this.doors = doors;
    }

    @Override
    public void execute() {
        doors.unlockDoor();
    }
}
