package com.startjava.lesson_2_3.robot;

public class Jaeger {
    private String name;
    private String mark;
    private String status;
    private int speed;
    private int kaijuKilled;
    private String bodyLanguage;

    public Jaeger() {
    }

    public Jaeger(String name, String mark, String status,
            int speed, int kaijuKilled, String bodyLanguage) {
        this.name = name;
        this.mark = mark;
        this.status = status;
        this.speed = speed;
        this.kaijuKilled = kaijuKilled;
        this.bodyLanguage = bodyLanguage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getKaijuKilled() {
        return kaijuKilled;
    }

    public void setKaijuKilled(int kaijuKilled) {
        this.kaijuKilled = kaijuKilled;
    }

    public String getBodyLanguage() {
        return bodyLanguage;
    }

    public void setBodyLanguage(String bodyLanguage) {
        this.bodyLanguage = bodyLanguage;
    }

    public void punch() {
        System.out.println("BOOM");
    }

    public void move() {
        System.out.println("It's moving!");
    }
}