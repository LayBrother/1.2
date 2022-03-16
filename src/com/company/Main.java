package com.company;

public class Main {

    public static void main(String[] args) {
        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener errListener = System.out::println;

        Worker worker = new Worker(listener, errListener);
        worker.start();
    }
}