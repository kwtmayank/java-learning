package learning.designPatterns.command.conceretCommand;

import learning.designPatterns.command.Command;
import learning.designPatterns.command.receiver.Light;

public class KitchenLightOnCommand implements Command {

    private final Light light;

    public KitchenLightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
