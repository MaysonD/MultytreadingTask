package com.company;

public class Main {

    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();
        new Consumer(sharedResource);
        new Producer(sharedResource);
    }
}
