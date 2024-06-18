package org.beta.curs9.homework.ex3.models;

import java.util.List;

public class Company {

    private List<Person> employees;
    private final String name;
    private final String address;
    private final String taxNumber;

    public Company(String name, String address, String taxNumber) {
        this.name = name;
        this.address = address;
        this.taxNumber = taxNumber;
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

    
}
