package ru.ranepa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        System.setOut(new java.io.PrintStream(System.out, true, "UTF-8"));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя");
        String name = scanner.next();
        List<Integer> marks = new ArrayList<>();
        System.out.println("Введите оценки:");
        while (true) {
            int mark = scanner.nextInt();
            if (mark == 0) {
                break;
            }
            marks.add(mark);
        }
        Student student = new Student(name, marks);
        System.out.println("Имя: " + student.getName());
        System.out.println("Оценки: " + student.getMarks());
        System.out.println("Средний балл: " + student.averageMarks());
        System.out.println("Статус: " + student.status());
    }
}
