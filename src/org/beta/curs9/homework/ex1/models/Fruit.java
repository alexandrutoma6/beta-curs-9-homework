package org.beta.curs9.homework.ex1.models;

public class Fruit {

    private final String name;
    private final String color;
    private final Double weight;

    public Fruit(String name, String color, Double weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    public Fruit(String name) {
        this.name = name;
        this.color = "green";
        this.weight = 1d;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public Double getWeight() {
        return weight;
    }

    public String toString(){
        return name;
    }
}
