package learning.designPatterns.command.client;

import learning.designPatterns.command.conceretCommand.KitchenLightOnCommand;
import learning.designPatterns.command.invoker.RemoteControl;
import learning.designPatterns.command.receiver.Light;

public class Main {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Light light = new Light();
        KitchenLightOnCommand lightOnCommand = new KitchenLightOnCommand(light);
        remoteControl.setCommands(0, lightOnCommand, null);
        remoteControl.onButtonWasPushed(0);
       // remoteControl.offButtonWasPushed(0);
    }
}
