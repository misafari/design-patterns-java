package com.safari.designPattern.behavioral.command;

import com.safari.designPattern.behavioral.command.fx.Command;

public class AddCustomerCommand implements Command {
    private final CustomerService service;

    public AddCustomerCommand(CustomerService service) {
        this.service = service;
    }

    @Override
    public void execute() {
        service.addCustomer();
    }
}
