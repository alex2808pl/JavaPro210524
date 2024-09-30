package de.telran.module_3.lesson_14.practice;

import java.util.Objects;

public class Phone {
    private String name;
    private int price;
    private String brand;

    public Phone(String name, int price, String brand) {
        this.name = name;
        this.price = price;
        this.brand = brand;

    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return price == phone.price && Objects.equals(name, phone.name) && Objects.equals(brand, phone.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, brand);
    }
}
