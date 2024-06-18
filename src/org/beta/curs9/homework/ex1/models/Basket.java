package org.beta.curs9.homework.ex1.models;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Basket {

    private List<Fruit> fruits;
    private final String material;
    private Double weight = 2d;

    public Basket(String material, List<Fruit> fruits) {
        this.material = material;
        this.fruits = fruits;
        for (Fruit fruit : fruits) {
            this.weight += fruit.getWeight();
        }
    }

    public List<Fruit> getFruits() {
        return fruits;
    }

    public String getMaterial() {
        return material;
    }

    public Double getWeight() {
        return weight;
    }

    public Boolean find(String fruitName) {
        for (Fruit fruit : fruits) {
            if (fruit.getName().equals(fruitName)) {
                return true;
            }
        }
        return false;
    }

    public Boolean remove(String fruitName) {
        for (Fruit fruit : fruits) {
            if (fruit.getName().equals(fruitName)) {
                fruits.remove(fruit);
                return true;
            }
        }
        return false;
    }

    public void add(String fruitName) {
        Fruit newFruit = new Fruit(fruitName);
        fruits.add(newFruit);
        System.out.println("Fruit: " + newFruit + " added to basket");
    }

    public Integer position(String fruitName) {
        for (int i = 0; i < fruits.size(); i++) {
            if (fruits.get(i).getName().equals(fruitName)) {
                return i;
            }
        }
        //if the list doesn't contain the searched fruit
        System.out.println("The fruit doesn't exist in the basket");
        return -10000;
    }

    public Collection<String> distinct() {
        Set<String> uniqueFruitNames = new HashSet<>();
        for (Fruit fruit : fruits) {
            uniqueFruitNames.add(fruit.getName());
        }
        return uniqueFruitNames;
    }

    public Integer count() {
        return fruits.size();
    }

    public Integer customCount() {
        Integer count = 0;
        for (Fruit fruit : fruits) {
            count++;
        }
        return count;
    }
}
