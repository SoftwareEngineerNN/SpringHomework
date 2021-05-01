package com.deadpool.harman.task1;

public class Main {
    public static void main(String[] args) {

        Hero hero = new Hero("Hello from Harman");
        Hero hero2 = new Hero("Hello from Yandex");
        Hero hero3 = new Hero("Hello from EPAM");

        Villian villian = new Villian();
        Villian villian2 = new Villian();
        Villian villian3 = new Villian();

        hero.start();
        hero2.start();
        hero3.start();

        villian.start();
        villian2.start();
        villian3.start();

    }
}
