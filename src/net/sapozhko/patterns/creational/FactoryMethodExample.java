package net.sapozhko.patterns.creational;

import net.sapozhko.patterns.creational.factory_method.ConcreteCreator;
import net.sapozhko.patterns.creational.factory_method.Creator;
import net.sapozhko.patterns.creational.factory_method.Product;

public class FactoryMethodExample {

    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        Product product = creator.factoryMethod();
        System.out.println(product);
    }
}
