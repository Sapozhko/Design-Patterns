package net.sapozhko.patterns.creational.factory_method;

public abstract class Product {
    protected String name;
    protected int number;

    protected Product() {
        setName();
        setNumber();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public abstract void setName();

    public abstract void setNumber();

    @Override
    public String toString() {
        return "Product: name = " + name + ", number = " + number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        return number == product.number && !(name != null ? !name.equals(product.name) : product.name != null);

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + number;
        return result;
    }
}
