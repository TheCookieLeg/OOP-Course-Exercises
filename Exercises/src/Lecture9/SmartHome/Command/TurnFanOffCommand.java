package Lecture9.SmartHome.Command;

import Lecture9.SmartHome.Receiver.Fan;

public class TurnFanOffCommand implements ICommand {
    private Fan fan;

    public TurnFanOffCommand(Fan fan) {
        this.fan = fan;
    }

    public void execute() {
        fan.turnOff();
    }
}
