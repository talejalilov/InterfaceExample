package com.company;

public class FileLogger implements Logger{

    @Override
    public void add(String message) {

        System.out.println("File adding: " + message);

    }
}
