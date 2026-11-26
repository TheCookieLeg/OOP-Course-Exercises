package Lecture9.SmartHome;

import Lecture9.SmartHome.Command.*;
import Lecture9.SmartHome.Invoker.RemoteControl;
import Lecture9.SmartHome.Receiver.*;

public class Main {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();

        Fan fan = new Fan();
        Light light = new Light();

        ICommand lightOnCommand = new TurnLightOnCommand(light);
        lightOnCommand.execute();
        ICommand lightOffCommand = new TurnLightOffCommand(light);
        lightOffCommand.execute();

        ICommand fanIncreaseCommand = new IncreaseFanSpeedCommand(fan);
        ICommand fanDecreaseCommand = new DecreaseFanSpeedCommand(fan);
        ICommand fanOffCommand = new TurnFanOffCommand(fan);
        ICommand fanOnCommand = new TurnFanOnCommand(fan);

        fanOnCommand.execute();
        fanIncreaseCommand.execute();
        fanIncreaseCommand.execute();
        fanDecreaseCommand.execute();
        fanOffCommand.execute();
        fanIncreaseCommand.execute();
    }
}
