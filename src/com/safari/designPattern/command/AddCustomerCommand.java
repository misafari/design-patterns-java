package com.safari.designPattern.command;

import com.safari.designPattern.command.fx.Command;

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
