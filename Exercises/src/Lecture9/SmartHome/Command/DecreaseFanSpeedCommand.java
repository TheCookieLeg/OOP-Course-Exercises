package Lecture9.SmartHome.Command;

import Lecture9.SmartHome.Receiver.Fan;

public class DecreaseFanSpeedCommand implements ICommand {
    private Fan fan;

    public DecreaseFanSpeedCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.decreaseSpeed();
    }
}
