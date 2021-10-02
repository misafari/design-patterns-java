package com.safari.designPattern.behavioral.command.fx;

public class Button {
    private String label;
    private final Command command;

    public Button(Command command) {
        this.command = command;
    }

    public void execute() {
        command.execute();
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
