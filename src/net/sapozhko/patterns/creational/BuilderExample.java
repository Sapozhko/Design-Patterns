package net.sapozhko.patterns.creational;

import net.sapozhko.patterns.creational.builder.ConcreteBuilder;
import net.sapozhko.patterns.creational.builder.Director;
import net.sapozhko.patterns.creational.builder.Product;

public class BuilderExample {

    public static void main(String[] args) {
        Director director = new Director(new ConcreteBuilder());
        director.constructProduct();
        Product product = director.getProduct();
        System.out.println(product);
    }
}
