package net.sapozhko.patterns.creational.factory_method;

public class ConcreteProduct extends Product {

    @Override
    public void setName() {
        this.name = "ConcreteProduct";
    }

    @Override
    public void setNumber() {
        this.number = this.hashCode();
    }
}
