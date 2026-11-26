package Lecture9.SmartHome.Command;

import Lecture9.SmartHome.Receiver.Fan;

public class TurnFanOnCommand implements ICommand {
    private Fan fan;

    public TurnFanOnCommand(Fan fan) {
        this.fan = fan;
    }

    public void execute() {
        fan.turnOn();
    }
}
