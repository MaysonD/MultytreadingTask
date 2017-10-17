package com.company;

public class Consumer implements Runnable {

    SharedResource resource;

    public Consumer(SharedResource resource) {
        this.resource = resource;
        Thread consumerThread = new Thread(this, "Потребитель ");
        consumerThread.start();
        System.out.println(consumerThread.getName());
    }

    public void run() {
        decrease();
    }

    private synchronized void decrease(){
        while (resource.counter > 5) {
            System.out.println(resource.counter);
            resource.counter--;
        }
    }
}
