package net.sapozhko.patterns.creational.builder_inner;

public class Product {
    private final int id;
    private final String name;
    private final int number;

    public Product(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.number = builder.number;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Product: id = " + id + ", name = " + name + ", number = " + number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        return id == product.id &&
                number == product.number &&
                !(name != null ? !name.equals(product.name) : product.name != null);

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + number;
        return result;
    }

    public static final class Builder {
        //Required
        private final int id;
        //Optional
        private String name;
        private int number;

        public Builder(int id) {
            this.id = id;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setNumber(int number) {
            this.number = number;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }
}
