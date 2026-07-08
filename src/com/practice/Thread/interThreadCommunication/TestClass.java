package com.practice.Thread.interThreadCommunication;

public class TestClass {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread producer = new Thread(() -> {
            try {
                for(int i=0; i<5; i++) {
                    resource.produce(i);
                    Thread.sleep(1000);
                }
            } catch (Exception e) {
                System.out.println("Producer Failed");
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                for(int i=0; i<5; i++) {
                    resource.consume();
                }
            } catch (Exception e) {
                System.out.println("Consumer Failed");
            }
        });

        producer.start();
        consumer.start();
    }
}
