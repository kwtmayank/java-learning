package learning.designPatterns.command.invoker;

import learning.designPatterns.command.Command;
import learning.designPatterns.command.conceretCommand.NoCommand;

public class RemoteControl {
    private final int numberOfSlots = 7;
    private Command[] onCommands;
    private Command[] offCommands;

    public RemoteControl() {
        this.onCommands = new Command[numberOfSlots];
        this.offCommands = new Command[numberOfSlots];
        for (int i = 0; i < numberOfSlots; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    public void setCommands(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }
    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }
    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }
}
