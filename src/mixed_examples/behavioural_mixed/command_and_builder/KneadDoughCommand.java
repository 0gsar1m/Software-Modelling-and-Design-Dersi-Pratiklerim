package mixed_examples.behavioural_mixed.command_and_builder;

public class KneadDoughCommand implements ICommand {
    private KitchenRobot robot;

    public KneadDoughCommand(KitchenRobot kitchenRobot) {
        this.robot = kitchenRobot;
    }

    @Override
    public void execute() {
        robot.kneadDough();
    }

    @Override
    public void undo() {
        System.out.println("[ERROR]: You can't undo kneading a dough lol");
    }
}
