package net.sapozhko.patterns.creational.builder;

public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void constructProduct() {
        builder.buildName();
        builder.buildNumber();
    }

    public Product getProduct() {
        return builder.getProduct();
    }
}
