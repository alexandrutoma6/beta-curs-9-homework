package org.beta.curs9.homework.ex3;

import org.beta.curs9.homework.ex3.models.Company;
import org.beta.curs9.homework.ex3.models.Person;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Mihai", 24);
        Person person2 = new Person("John", 34);
        Person person3 = new Person("Ana", 26);
        Person person4 = new Person("Raul", 20);
        Person person5 = new Person("Lucia", 31);
        Person person6 = new Person("Andreea", 22);

        person1.setPosition("manager");
        person2.setPosition("carpenter");
        person3.setPosition("welder");
        person4.setPosition("welder");
        person5.setPosition("seller");
        person6.setPosition("manager");

        Company myCompany = new Company("CompSRL", "Oradea", "9654765");

        myCompany.employ(person1);
        myCompany.employ(person2);
        myCompany.employ(person2);
        myCompany.employ(person3);
        myCompany.employ(person4);
        myCompany.employ(person5);
        myCompany.employ(person6);

        myCompany.getEmployees();


    }
}
