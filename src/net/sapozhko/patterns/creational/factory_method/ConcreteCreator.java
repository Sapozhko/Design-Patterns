package net.sapozhko.patterns.creational.factory_method;

public class ConcreteCreator extends Creator {

    @Override
    public Product factoryMethod() {
        return new ConcreteProduct();
    }
}
