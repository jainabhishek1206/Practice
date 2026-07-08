package com.practice.Thread.interThreadCommunication;

/*This is the classic example of Producer Consumer problem*/
public class SharedResource {
    private int data;
    private boolean available = false;

    public synchronized void produce(int value) throws InterruptedException {
        while(available) {
            wait();
        }
        data = value;
        System.out.println("Produced "+data);
        available = true;
        notify();
    }

    public synchronized void consume() throws InterruptedException {
        while(!available) {
            wait();
        }
        System.out.println("Consumed "+data);
        available = false;
        notify();
    }
}
