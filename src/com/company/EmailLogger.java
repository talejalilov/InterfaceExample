package com.company;

public class EmailLogger implements Logger{

    @Override
    public void add(String message) {

        System.out.println("Email adding: " + message);

    }
}
