package net.sapozhko.patterns.creational.builder;

public interface Builder {

    void buildName();

    void buildNumber();

    Product getProduct();
}
