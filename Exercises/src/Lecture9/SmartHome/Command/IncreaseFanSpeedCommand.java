package Lecture9.SmartHome.Command;

import Lecture9.SmartHome.Receiver.Fan;

public class IncreaseFanSpeedCommand implements ICommand {

    private Fan fan;

    public IncreaseFanSpeedCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.increaseSpeed();
    }
}
