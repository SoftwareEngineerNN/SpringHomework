package com.deadpool.harman.task4;

public class Superman {


    public synchronized void method1() {
        System.out.println("I am going to invoke method 2");
        method2();
    }

    public synchronized void method2() {
        System.out.println("I am going to invoke method 3");
        method3();
    }
    public synchronized void method3() {
        System.out.println("WTF???");
    }

}
