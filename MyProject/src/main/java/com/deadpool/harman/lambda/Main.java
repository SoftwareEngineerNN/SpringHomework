package com.deadpool.harman.lambda;

import lombok.SneakyThrows;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        Expression sum = Double::sum;
        Expression sub = (a,b)-> a-b;
        Expression mult = (a,b)-> a * b;

        Integer i = 555;

        AtomicInteger k = new AtomicInteger(5);

        Expression someExp = (a, b) -> {
            k.set(-1);
            return a - b/ k.get();
        };

        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread.start();
        System.out.println(sum.operation(1.0,2.0));
        System.out.println(sub.operation(1.0,2.0));
        System.out.println(mult.operation(1.0,2.0));


    }
}
