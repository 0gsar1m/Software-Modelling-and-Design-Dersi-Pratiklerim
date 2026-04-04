package mixed_examples.behavioural_mixed.command_based.command_and_builder;

import java.util.ArrayList;
import java.util.List;

//When It comes to merge with builder, we have to create "nativa commands" of KitchenRobot inside the RobotController:

public class RobotController {
    private ICommand command;
    private List<ICommand> commandList = new ArrayList<>();
    private KitchenRobot robot;
    private ICommand lastCommand;

    public RobotController(KitchenRobot robot) {
        this.robot = robot;
    }

    // --- FLUENT BUILDER METHODS ---

    public RobotController chop(){
        ICommand chopCmnd = new ChopCommand(robot); //that's why constructor is necessary;
        addCommandToList(chopCmnd);
        this.lastCommand = chopCmnd;

        return this;
    }
    public RobotController stir(){
        ICommand chopCmnd = new StirCommand(robot); //that's why constructor is necessary;
        addCommandToList(chopCmnd);
        this.lastCommand = chopCmnd;

        return this;
    }
    public RobotController knead(){
        ICommand chopCmnd = new KneadDoughCommand(robot); //that's why constructor is necessary;
        addCommandToList(chopCmnd);
        this.lastCommand = chopCmnd;

        return this;
    }

    public void setSingleCommand(ICommand commandToSet) {
        this.command = commandToSet;
        System.out.println(command.getClass().getSimpleName() + " were set to command");
    }

    public RobotController addCommandToList(ICommand command) {
        commandList.add(command);
        System.out.println(command.getClass().getSimpleName() + " were added to command list");
        return this;
    }

    public void executeOneCommand() {
        command.execute();
    }

    public void executeCommandList() {
        for (ICommand command : commandList) {
            command.execute();
        }
        commandList.clear();
    }

    public void undoCommand() {
        if (lastCommand != null) {
            lastCommand.undo();
        }
    }
}
