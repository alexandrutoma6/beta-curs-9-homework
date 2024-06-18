package org.beta.curs9.homework.ex3.models;

import org.w3c.dom.ls.LSInput;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private List<Person> employees;
    private final String name;
    private final String address;
    private final String taxNumber;
    private Boolean hasManager = false;

    public Company(String name, String address, String taxNumber) {
        this.name = name;
        this.address = address;
        this.taxNumber = taxNumber;
        this.employees = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getTaxNumber() {
        return taxNumber;
    }

    //ii corect nameing-ul? metoda sa aibe acelasi nume cu proprietatea?
    public Boolean hasManager() {
        return hasManager;
    }

    public void getEmployees() {
        for (Person person : employees) {
            System.out.println(person);
        }
    }

    public Person getManager() {
        if (hasManager) {
            for (Person person : employees) {
                if (person.getPosition().equals("manager")) {
                    return person;
                }
            }
        }
        return null;
    }

    public List<Person> getPersons(String profession) {
        List<Person> result = new ArrayList<>();
        for (Person person : employees) {
            if (person.getPosition().equals(profession)) {
                result.add(person);
            }
        }
        return result;
    }

    public List<Person> getPersonOlder(int age) {
        List<Person> result = new ArrayList<>();
        for (Person person : employees) {
            if (person.getAge() > age) {
                result.add(person);
            }
        }
        return result;
    }

    public List<Person> getPerson(String filterName) {
        List<Person> result = new ArrayList<>();
        for (Person person : employees) {
            if (person.getName().contains(filterName)) {
                result.add(person);
            }
        }
        return result;
    }

    /* this method have 4 edge-cases:
    *   1.the person is already employed on the company - gives an error message
    *   2.the company already have a manager, and the person to be employed is a manager - gives an error message
    *   3.the person is a manager and the company doesn't have one - sets the hasManager property to true
    *   4.the person has an ordinary position - just add the person to the employees list
    * */

    public void employ(Person person) {
        if (employees.contains(person)) {
            System.out.println(person + " is already employed on this company");
        } else {
            if (hasManager && person.getPosition().equals("manager")) {
                System.out.println("There is already a manager! We cannot employ " + person);
            } else {
                if (person.getPosition().equals("manager")) {
                    hasManager = true;
                }
                employees.add(person);
                System.out.println(person + " has been employed!");
            }
        }
    }

}
