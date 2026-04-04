package mixed_examples.behavioural_mixed.command_based.command_and_composite;

public class LockDoorCommand implements ICommand {
    private Door doors;

    public LockDoorCommand(Door doors) {
        this.doors = doors;
    }

    @Override
    public void execute() {
        doors.lockDoor();
    }
}
