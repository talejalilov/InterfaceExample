package com.company;

public class DatabaseLogger implements Logger{
    @Override
    public void add(String message) {

        System.out.println("Database adding: " + message);

    }
}
