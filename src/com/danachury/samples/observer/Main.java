package com.danachury.samples.observer;

/**
 * Observer is a pattern that us help to recognize events.
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        final var v8 = new Engine();
        final var accelerator = new Accelerator();
        accelerator.assembleEngine(v8);
        System.out.println("Accelerating...");
        accelerator.accelerate();
    }
}
