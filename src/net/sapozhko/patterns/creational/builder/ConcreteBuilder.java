package net.sapozhko.patterns.creational.builder;

public class ConcreteBuilder implements Builder {

    @Override
    public Product build() {
        return new Product("Concrete Product", this.hashCode());
    }
}
