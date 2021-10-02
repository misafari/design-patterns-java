package com.safari.designPattern.behavioral.template;

public class SimpleTask extends Task{
    public SimpleTask(Audit audit) {
        super(audit);
    }

    @Override
    protected void doExecute() {
        System.out.println("Simple Task");
    }
}
