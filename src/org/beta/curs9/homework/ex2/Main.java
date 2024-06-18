package org.beta.curs9.homework.ex2;

import org.beta.curs9.homework.ex2.models.Buqet;
import org.beta.curs9.homework.ex2.models.Flower;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Flower f1 = new Flower("trandafir", "red");
        Flower f2 = new Flower("panseluta", "red");
        Flower f3 = new Flower("garoafa", "red");
        Flower f4 = new Flower("bujor", "red");

        Set<Flower> setFlowers = new HashSet<>();
        setFlowers.add(f1);
        setFlowers.add(f2);
        setFlowers.add(f3);
        setFlowers.add(f4);

        Buqet buqet = new Buqet(setFlowers);

        System.out.println(buqet.getAllSet());
        System.out.println(buqet.getAll());
        buqet.add("Margareta");
        System.out.println(buqet.getAll());
        buqet.remove("Margareta");
        System.out.println(buqet.getAll());

    }
}
