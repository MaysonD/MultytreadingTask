package com.company;

public class Producer implements Runnable {

    SharedResource resource;

    public Producer(SharedResource resource) {
        this.resource = resource;
        Thread producerThread  = new Thread(this, "Поставщик ");
        producerThread.start();
        System.out.println(producerThread.getName());
    }

    public void run() {
        increase();
    }

    public synchronized void increase() {
        while (resource.counter< 10) {
            resource.counter++;
            System.out.println(resource.counter);
        }
    }
}
