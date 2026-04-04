package mixed_examples.behavioural_mixed.command_based.command_and_builder;

public class StirCommand implements ICommand {

    private KitchenRobot robot;

    public StirCommand(KitchenRobot kitchenRobot) {
        this.robot = kitchenRobot;
    }

    @Override
    public void execute() {
        robot.stirSoup();
    }

    @Override
    public void undo() {
        System.out.println("[ERROR]: You can't undo stirring a soup lol");
    }
}
