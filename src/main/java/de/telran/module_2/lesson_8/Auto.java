package de.telran.module_2.lesson_8;

import java.util.Objects;

public class Auto extends Vehicle{
    private String id; // самый уникальный идентификатор
    private String number;
    private String name;
    private int countDoors;

    public Auto() {
    }

    public Auto(String number, String name, int countDoors) {
        this.number = number;
        this.name = name;
        this.countDoors = countDoors;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountDoors() {
        return countDoors;
    }

    public void setCountDoors(int countDoors) {
        this.countDoors = countDoors;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // Рефлексивность
        if (o == null || getClass() != o.getClass()) return false; //сравнение с null
        Auto auto = (Auto) o;
        return countDoors == auto.countDoors
                && Objects.equals(number, auto.number)
                && Objects.equals(name, auto.name);

        // return  Objects.equals(id, auto.id);
    }


    @Override
    public int hashCode() {
        return Objects.hash(number, name, countDoors); //31*number +31*name + 31*4

        //return Objects.hash(id); //31*number +31*name + 31*4
    }
}
