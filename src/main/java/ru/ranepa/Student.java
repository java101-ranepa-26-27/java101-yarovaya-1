package ru.ranepa;

import java.util.List;

public class Student {
    String name;
    List<Integer> marks;

    public Student(String name, List<Integer> marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getMarks() {
        return marks;
    }

    public void setMarks(List<Integer> marks) {
        this.marks = marks;
    }

    public double averageMarks() {
        int sum=0;
        for (Integer mark: marks){
            sum+=mark;
        }
        return (double) sum / marks.size();
}
public String status() {
    double average = averageMarks();
    if (average >= 4.5) {
        return "отличник";
    }
    else if (average >= 3.5) {
        return "хорошист";
    }
    else if (average >= 2.5) {
        return "троечник";
    }
    else return "двоечник";
    }




}

