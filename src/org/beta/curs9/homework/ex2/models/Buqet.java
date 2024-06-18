package org.beta.curs9.homework.ex2.models;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Buqet {

    private Set<Flower> flowers;

    public Buqet(Set<Flower> flowers) {
        this.flowers = flowers;
    }

    //getAll() that returns a Set of flowers not a Collection
    public Set<Flower> getAllSet() {
        return flowers;
    }

    public Collection<String> getAll() {
        Set<String> flowerNames = new HashSet<>();
        for (Flower flower : flowers) {
            flowerNames.add(flower.getName());
        }
        return flowerNames;
    }

    public void add(String flowerName) {
        Flower newFlower = new Flower(flowerName, "red");
        flowers.add(newFlower);
    }

    public void remove(String flowerName) {
        for (Flower flower : flowers) {
            if (flower.getName().equals(flowerName)) {
                flowers.remove(flower);
                System.out.println("Flower " + flower + " removed");
            }
            break;
        }
    }

}
