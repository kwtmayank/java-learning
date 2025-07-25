package learning.designPatterns.command.conceretCommand;

import learning.designPatterns.command.Command;

public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("No command");
    }
}
