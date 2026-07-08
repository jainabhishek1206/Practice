package com.practice.Thread.interThreadCommunication;

public class WaitNotifyDemo {
    private static  Object lock = new Object();
    public static void main(String[] args) throws InterruptedException {
        Thread consumer = new Thread(() -> {
            synchronized (lock) {
                try {
                    System.out.println("Waiting");
                    lock.wait();
                    System.out.println("Resumed");
                } catch (InterruptedException e) {
                e.printStackTrace();
                }
            }
        });

        Thread producer = new Thread(() -> {
            synchronized (lock) {
                System.out.println("Notifying");
                lock.notify();
            }
        });
        consumer.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        producer.start();


    }
}
