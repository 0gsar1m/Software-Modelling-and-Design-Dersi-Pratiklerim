package mixed_examples.behavioural_mixed.command_based.command_and_composite;

import java.util.ArrayList;
import java.util.List;

public class Routine implements ICommand {
    private List<ICommand> commandList = new ArrayList<>();

    @Override
    public void execute() {
        for (ICommand c : commandList) {
            c.execute();
        }
    }

    public void addCommand(ICommand command) {
        commandList.add(command);
    }

    public void removeCommand(ICommand command) {
        commandList.remove(command);
    }
}
