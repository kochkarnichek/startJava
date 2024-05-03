package com.startjava.lesson_2_3.person;

public class Person {
    String gender = "female";
    String name = "Liubov";
    double height = 1.73;
    int weight = 63;
    int age = 23;

    public void walk() {
        System.out.println("Может идти");
    }

    public void seat() {
        System.out.println("Может сидеть");
    }

    public void run() {
        System.out.println("Может бегать");
    }

    public void talk() {
        System.out.println("Может говорить");
    }

    public void learnJava() {
        System.out.println("Может учить Java");
    }
}