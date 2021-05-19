package com.company;

public class Main {

    public static void main(String[] args) {

        Logger [] loggers = {new DatabaseLogger(),new FileLogger()};

        CustomerManager customerManager = new CustomerManager(loggers);

        Customer customer = new Customer(1,"CostumerName","CustomerSurname");

        customerManager.add(customer);

        }
}
