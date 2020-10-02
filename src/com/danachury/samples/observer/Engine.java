package com.danachury.samples.observer;

public class Engine implements Observer {

    @Override
    public void update() {
        System.out.println("Increasing velocity and revolutions...");
    }
}
