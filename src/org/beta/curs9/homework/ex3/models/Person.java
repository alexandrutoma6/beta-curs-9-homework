package org.beta.curs9.homework.ex3.models;

public class Person {

    private final String name;
    private final Integer age;
    private String position;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }

    public String toString(){
        return name;
    }
}
