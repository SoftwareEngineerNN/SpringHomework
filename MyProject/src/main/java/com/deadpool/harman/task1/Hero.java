package com.deadpool.harman.task1;

import lombok.SneakyThrows;

public class Hero extends Thread{

    private String startUpMessage;
    private String destroy = "I'm gonna die";

    public Hero(String startUpMessage) {
        this.startUpMessage = startUpMessage;
    }

    @SneakyThrows
    @Override
    public void run() {
        for (int i = 0; i <3 ; i++) {

            System.out.println(startUpMessage);
            Thread.sleep(1000);

        }
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(destroy);
    }
}
