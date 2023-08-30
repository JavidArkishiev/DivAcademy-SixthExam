package org.example.tasks.task3;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = List.of("Java ","Javascript","Python");
        List<String> result = list.stream()
                .sorted((a, b) -> Integer.compare(a.length(), b.length()))
                .collect(Collectors.toList());
        System.out.println("Result " + result);

    }
}
