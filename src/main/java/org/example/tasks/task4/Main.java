package org.example.tasks.task4;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list=List.of(3,4,5,6,7,8,12,4,5,10);
        list.stream()
                .filter(n->n%5!=0 || n%2==0 )
                .forEach(System.out::println);

    }
}
