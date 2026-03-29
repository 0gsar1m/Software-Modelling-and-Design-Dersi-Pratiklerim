package mixed_examples.behavioural_mixed.command_and_builder;

public class Main {
    static void main() {
        KitchenRobot robot = new KitchenRobot();

        RobotController robotController = new RobotController(robot);

        ICommand chop = new ChopCommand(robot);
        ICommand stir = new StirCommand(robot);
        ICommand knead = new KneadDoughCommand(robot);

        robotController.    chop()
                              .knead()
                                .stir();

        System.out.println("Executing: ----------------------");

        robotController.executeCommandList();

        System.out.println("Commands executed. Command list clear.");

        robotController.addCommandToList(chop)
                        .addCommandToList(stir)
                            .addCommandToList(knead);

        System.out.println("Executing: ----------------------");

        robotController.executeCommandList();
    }
}
