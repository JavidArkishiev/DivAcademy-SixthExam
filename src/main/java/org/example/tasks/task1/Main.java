package org.example.tasks.task1;

public class Main {
    public static void main(String[] args)  {
        Thread thread=new Thread(new MyRunnable("Thread 1"));
        Thread thread2=new Thread(new MyRunnable1("Thread 2"));
        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread.start();
        try {
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread2.start();
        try {
            thread.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
