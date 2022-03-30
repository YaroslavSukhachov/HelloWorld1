package main;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Student s = new Student("Ярик", 30, "1", 90.0);
        Student s2 = new Student("Неярик", 18, "2", 90.0);
        Student s3 = new Student("Вася");
        Student s4 = new Student();

        s = s4;
        System.out.println(s4.getName());
        System.out.println(s4.getAge());
    }

}
