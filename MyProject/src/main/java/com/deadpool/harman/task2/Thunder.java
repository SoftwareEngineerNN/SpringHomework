package com.deadpool.harman.task2;

public class Thunder extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100 ; i++) {
            Storm.a++;
            System.out.println("a incremented by 1");
        }
        Storm.isFinished = true;


    }
}
