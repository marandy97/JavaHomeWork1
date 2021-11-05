package com.pb.marandy.hw6;

import java.util.Objects;

public class Horse extends Animal{
    private String color;

    public Horse(String name, String food, String location, String color) {
        super(name, food, location);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void makeNoise() {
        System.out.println("Тыгыдык!");
    }
    public void eat(){
        System.out.println(getName() + " ест");
    }
    public String toString(){
        return  "Лошадь: кличка = "+ getName()+" еда = "+getFood()+" нахождение = "+getLocation()+" цвет = "+getColor();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Horse horse = (Horse) o;
        return Objects.equals(color, horse.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }
}