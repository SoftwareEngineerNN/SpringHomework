package com.deadpool.harman.task4;

import lombok.SneakyThrows;

public class Batman extends Thread{

    @SneakyThrows
    @Override
    public void run() {
        System.out.println("I am going to invoke method 1");
        Thread.sleep(1000);
        new Superman().method1();
    }
}
