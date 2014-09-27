package net.sapozhko.patterns.creational.builder;

public class ConcreteBuilder implements Builder {

    private Product product = new Product();

    @Override
    public void buildName() {
        product.setName("Concrete Product");
    }

    @Override
    public void buildNumber() {
        product.setNumber(this.hashCode());
    }

    @Override
    public Product getProduct() {
        return product;
    }
}
