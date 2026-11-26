package Lecture9.SmartHome.Command;

import Lecture9.SmartHome.Receiver.Light;

public class TurnLightOnCommand implements ICommand {
    private Light light;

    public TurnLightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.turnOn();
    }
}
