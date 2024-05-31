package com.startjava.lesson_2_3_4.animal;

public class WolfTest {
    public static void main(String[] args) { 
        Wolf wolfOne = new Wolf();
        wolfOne.setGender("самец");
        wolfOne.setGender("Тодзи");
        wolfOne.setWeight(40);
        wolfOne.setAge(5);
        wolfOne.setColor("серый");

        System.out.println("Волк " + wolfOne.getName() + " - " + wolfOne.getGender() +
                ". Его вес - " + wolfOne.getWeight() + " кг, возраст - " +
                wolfOne.getAge() + " лет, а окрас шерсти - " + wolfOne.getColor());

        wolfOne.walk();
        wolfOne.seat();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();
    }
}