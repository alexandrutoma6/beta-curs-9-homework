package org.beta.curs9.homework.ex1;

import org.beta.curs9.homework.ex1.models.Basket;
import org.beta.curs9.homework.ex1.models.Fruit;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Fruit apple = new Fruit("apple","red",3d);
        Fruit apple2 = new Fruit("apple2","red",3d);
        Fruit apple3 = new Fruit("apple3","red",4d);
        Fruit apple4 = new Fruit("apple4","red",5d);

        List<Fruit> list = new ArrayList<>();
        list.add(apple);
        list.add(apple2);
        list.add(apple3);
        list.add(apple4);
        list.add(apple4);

        Basket basket = new Basket("textil", list);

        System.out.println(basket.getWeight());

        System.out.print(basket.find("apple6"));
        System.out.println(basket.remove("apple9"));
        basket.add("Cherry");
        System.out.println(basket.getFruits());
        System.out.println(basket.distinct());
        System.out.println(basket.count());
        System.out.println(basket.customCount());
    }
}
