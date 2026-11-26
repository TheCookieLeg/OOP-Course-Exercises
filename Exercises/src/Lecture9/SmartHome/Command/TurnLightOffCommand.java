package Lecture9.SmartHome.Command;

import Lecture9.SmartHome.Receiver.Light;

public class TurnLightOffCommand implements ICommand {
    private Light light;

    public TurnLightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.turnOff();
    }
}
