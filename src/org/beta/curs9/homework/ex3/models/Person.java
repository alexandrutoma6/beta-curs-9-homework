package org.beta.curs9.homework.ex3.models;

public class Person {

    private final String name;
    private final Integer age;
    private Boolean isEmployed;
    private String position;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
        this.isEmployed = false;
    }

    public Person(String name, Integer age, Boolean isEmployed, String position) {
        this.name = name;
        this.age = age;
        this.isEmployed = isEmployed;
        this.position = position;
    }

    public void setPosition(String position) {
        this.position = position;
        this.isEmployed = true;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getPosition() {
        if(isEmployed){
            return position;
        }else{
            return "The person is not employed!";
        }
    }

    public String toString(){
        return name;
    }
}
