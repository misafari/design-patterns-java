package com.safari.designPattern.behavioral.template;

public abstract class Task {
    private final Audit audit;

    public Task(Audit audit) {
        this.audit = audit;
    }

    public void execute() {
        audit.record();
        doExecute();
    }

    protected abstract void doExecute();
}
