package com.company;

import jdk.jshell.execution.Util;

public class CustomerManager {

    private Logger[] loggers;

    public CustomerManager(Logger[] loggers) {
        this.loggers = loggers;
    }

    public void add(Customer customer){
        System.out.println("Client adding: " + customer.getName());


        Utils.runLoggers(loggers,customer.getName());
    }

    public void delete(Customer customer){
        System.out.println("Client deleted" + customer.getName());

        Utils.runLoggers(loggers,customer.getSurname());


    }
}
