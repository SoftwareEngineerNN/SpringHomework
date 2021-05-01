package com.deadpool.harman.task1;

public class Villian extends Thread{

    private String destroy = "What the FUCK????";

    @Override
    public void run() {
        for (int i = 0; i < 100 ; i++) {
            System.gc();
            System.runFinalization();
            System.out.println("This is happened");
        }
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(destroy);
    }
}
