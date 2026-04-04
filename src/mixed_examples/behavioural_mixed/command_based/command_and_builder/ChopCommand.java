package mixed_examples.behavioural_mixed.command_based.command_and_builder;

public class ChopCommand implements ICommand {
    private KitchenRobot robot;

    public ChopCommand(KitchenRobot kitchenRobot){
        this.robot = kitchenRobot;
    }

    @Override
    public void execute() {
        robot.chopVegetables();
    }

    @Override
    public void undo() {
        System.out.println("[ERROR]: You can't undo chopping vegetables lol");
    }
}
