package com.Inheritance.ex6;

import java.util.Objects;

public class Item {
    private String description;
    private double price;

    public Item(String description, double price) {
        this.description = description;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Double.compare(item.price, price) == 0 &&
                Objects.equals(description, item.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, price);
    }
}
