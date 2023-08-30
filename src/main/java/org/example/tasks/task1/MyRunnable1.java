package org.example.tasks.task1;

public class MyRunnable1 implements Runnable{
    private String name;

    public MyRunnable1(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 50; i <= 100; i++) {
            System.out.println(this.name+" "+i);

        }
    }
}
