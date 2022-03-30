package main;

public class Student {
    String name = "default";
    int age = 1;
    String studentId = "default";
    double avgMark = 60.0;

    {
        age = 18;
    }

    Student() {
        name = "name";
    }

    Student(String name, int age, String studentId, double avgMark) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        this.avgMark = avgMark;
    }

    Student(String name) {
        this.name = name;
    }

    void study(String name) {
        this.name = "123";
        System.out.println("student is studying");
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

}
