package com.danachury.samples.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Flow;

public class Accelerator implements ObserverSubject {

    private final List<Observer> engines;

    public Accelerator() {
        this(new ArrayList<>());
    }

    public Accelerator(List<Observer> engines) {
        this.engines = engines;
    }

    @Override
    public void notifyChange() {
        if (this.engines.isEmpty())
            System.out.println("No engines assembled yet.");
        else
            this.engines
                .forEach(Observer::update);
    }

    public void accelerate() {
        this.notifyChange();
    }

    public void assembleEngine(Observer engine) throws InterruptedException {
        System.out.println("Assembling engine '" + engine.getClass().getSimpleName() +"'...");
        Thread.sleep(4000);
        this.engines.add(engine);
        System.out.println("Engine '"+ engine.getClass().getSimpleName() + "' assembled successfully.");
    }
}
