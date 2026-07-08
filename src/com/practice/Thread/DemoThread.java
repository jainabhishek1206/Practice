package com.practice.Thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class DemoThread {
    public static void main(String args[]) throws ExecutionException, InterruptedException {
//        Different ways to create a thread

//        1. Using runnable interface
        Thread t1 = new Thread(new DemoRunnable());
        t1.start();

        Thread t2 = new Thread(() -> {
            System.out.println("Hello");
        });
        t2.start();

//        How to call callable interface
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<Integer> future = executorService.submit(new DemoCallable());
        System.out.println(future.get());
        executorService.shutdown();

        // runnable using executor service, Focus on the ? as it return no result
        Future<?> future2 = executorService.submit(() -> {
            System.out.println("hey there");
        });

        // callable using Lambda function
        Future<Integer> future3 = executorService.submit(() -> {return 10+20;});

        /*Remember executor service can take both runnable and callable methods,
        if your lambda function returns a result then it become callable otherwise it become runnable*/
    }
}
