package com.safari.designPattern.behavioral.template;

public class TransferMoney extends Task{
    public TransferMoney(Audit audit) {
        super(audit);
    }

    @Override
    protected void doExecute() {
        System.out.println("Transfer Money doExecute");
    }
}
