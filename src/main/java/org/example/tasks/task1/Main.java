package org.example.tasks.task1;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread thread=new Thread(new MyRunnable("Thread 1"));
        Thread thread2=new Thread(new MyRunnable("Thread 2"));
        thread.start();
        thread2.start();

    }
}
