package com.deadpool.harman.task2;

public class Blizzard extends Thread{

    @Override
    public void run() {

        while (!Storm.isFinished) {

        }
        System.out.println("variable a = " + Storm.a);
    }
}
