package behavioural_patterns.command.KitchenRobot;

import java.util.ArrayList;
import java.util.List;

public class RobotController {
    private ICommand command;

    private List<ICommand> commandList = new ArrayList<>();

    public void setCommand(ICommand commandToSet){
        this.command = commandToSet;
        System.out.println(command.getClass().getSimpleName() + " were set to command");
    }
    public void addCommandToList(ICommand command){
        commandList.add(command);
        System.out.println(command.getClass().getSimpleName() + " were added to command list");
    }
    public void executeOneCommand(){
        command.execute();
    }
    public void executeCommandList(){
        for (ICommand command : commandList){
            command.execute();
        }
    }
    public void undoCommand(){
        command.undo();
    }
}
