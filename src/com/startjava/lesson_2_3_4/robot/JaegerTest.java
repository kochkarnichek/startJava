package com.startjava.lesson_2_3_4.robot;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger firstJaeger = new Jaeger();

        firstJaeger.setName("Striker Eureka");
        firstJaeger.setMark("Mark-5");
        firstJaeger.setStatus("destroyed");
        firstJaeger.setSpeed(10);
        firstJaeger.setKaijuKilled(11);
        firstJaeger.setBodyLanguage("Dirty Boxer");

        System.out.println("First Jaeger's name is " + firstJaeger.getName() +
                ". It's " + firstJaeger.getMark() + ". \nUnfortunately it's " +
                firstJaeger.getStatus() + " but " + firstJaeger.getName() + "'s speed was " +
                firstJaeger.getSpeed() + " and it killed " + firstJaeger.getKaijuKilled() + 
                " Kaiju.\nAnd btw its body language was " + firstJaeger.getBodyLanguage());

        firstJaeger.punch();
        firstJaeger.move();

        Jaeger secondJaeger = new Jaeger("Gipsy Danger", "Mark-3", "destroyed",
                7, 9, "Street Fighter");

        System.out.println("\nMoving on to second Jaeger - " + secondJaeger.getName() +
                ". It's " + secondJaeger.getMark() + ". \nUnfortunately it's " +
                secondJaeger.getStatus() + " too but " + secondJaeger.getName() + "'s speed was " +
                secondJaeger.getSpeed() + " and it killed " + secondJaeger.getKaijuKilled() + 
                " Kaiju.\nIts body language was " + secondJaeger.getBodyLanguage());

        secondJaeger.punch();
        secondJaeger.move();
    }
}