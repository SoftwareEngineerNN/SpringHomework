package com.deadpool.harman.task2;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thunder thunder = new Thunder();
        Blizzard blizzard = new Blizzard();
        thunder.start();
        blizzard.start();

    }
}
