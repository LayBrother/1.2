package com.company;

public class Worker {
    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i == 32) {
                //33 задача имеет номер при выводе на экран 32, т.к. нумерация с 0
                errorCallback.onError("!!!!! TASK " + i + " IS ERROR !!!!!");
                continue;
            }
            callback.onDone("Task " + i + " is done");
        }
    }
}