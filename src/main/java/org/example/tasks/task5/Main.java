package org.example.tasks.task5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> list=new ArrayList<>();
        list.add(new Student("Javid"));
        list.add(new Student("Mehemmed"));
        list.add(new Student("Azad"));
        Collections.sort(list);
        for (Student student : list) {
            System.out.println(student);
        }

    }
}
