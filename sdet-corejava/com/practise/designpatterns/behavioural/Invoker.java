package com.practise.designpatterns.behavioural;

public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        this.command.execute();
    }

    public void unexecuteCommand() {
        this.command.unexecute();
    }
}
