package org.beta.curs9.homework.ex2.models;

public class Flower {

    private final String name;
    private final String color;

    public Flower(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String toString(){
        return name;
    }
}
