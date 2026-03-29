package behavioural_patterns.command.KitchenRobot;

public class Main {
    static void main() {
        KitchenRobot robot = new KitchenRobot();

        RobotController robotController = new RobotController();

        ICommand chop = new ChopCommand(robot);
        ICommand stir = new StirCommand(robot);
        ICommand knead = new KneadDoughCommand(robot);

        robotController.addCommandToList(chop);
        robotController.addCommandToList(stir);

        robotController.executeCommandList();
        System.out.println("---------------------");
        robotController.setCommand(knead);
        robotController.executeOneCommand();
    }
}
