package learning.designPatterns.command.conceretCommand;

import learning.designPatterns.command.Command;
import learning.designPatterns.command.receiver.Light;

public class KitchenLightOffCommand implements Command {
    private Light kitchenLight;

    public KitchenLightOffCommand(Light kitchenLight) {
        this.kitchenLight = kitchenLight;
    }

    public void execute() {
        kitchenLight.off();
    }
}
