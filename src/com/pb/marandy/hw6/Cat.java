package com.pb.marandy.hw6;

import java.util.Objects;

public class Cat extends Animal{
    int weight;

    public Cat(String name, String food, String location, int weight) {
        super(name, food, location);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void makeNoise() {
        System.out.println("Мяуууу !");
    }
    public void eat(){
        System.out.println(getName() + " ест!");
    }
    public String toString(){
        return  "Кот: кличка = "+ getName()+" еда = "+getFood()+" нахождение = "+getLocation()+" вес = "+getWeight();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return weight == cat.weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight);
    }
}