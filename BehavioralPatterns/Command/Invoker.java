package BehavioralPatterns.Command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : J. Andres Boyaca (janbs)
 * @since : 26/09/20
 **/
public class Invoker implements ICommand {
    List<ICommand> commands;

    public Invoker() {
        commands = new ArrayList<>();
    }

    public void add(ICommand command) {
        commands.add(command);
    }

    @Override
    public void execute() {
        commands.forEach(ICommand::execute);
    }

    @Override
    public void recover() {
        commands.forEach(ICommand::recover);
    }
}
