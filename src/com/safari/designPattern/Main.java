package com.safari.designPattern;

import com.safari.designPattern.command.AddCustomerCommand;
import com.safari.designPattern.command.CustomerService;
import com.safari.designPattern.command.fx.Button;
import com.safari.designPattern.command.fx.Command;

public class Main {

    public static void main(String[] args) {
        CustomerService service = new CustomerService();
        Command addCustomerCommand = new AddCustomerCommand(service);
        Button btn = new Button(addCustomerCommand);
        btn.execute();
    }
}
