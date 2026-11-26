package Lecture9.SmartHome.Invoker;

import Lecture9.SmartHome.Command.ICommand;

public class RemoteControl {

    private ICommand command;

    public void setCommand(ICommand command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}
