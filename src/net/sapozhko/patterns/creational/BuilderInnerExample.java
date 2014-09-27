package net.sapozhko.patterns.creational;

import net.sapozhko.patterns.creational.builder_inner.Product;

import java.util.Random;

public class BuilderInnerExample {

    public static void main(String[] args) {
        Random random = new Random();
        int id = random.nextInt(10);
        int number = random.nextInt(100);

        Product product = new Product.Builder(id).setName("BuilderInner").setNumber(number).build();
        System.out.println(product);
    }
}
