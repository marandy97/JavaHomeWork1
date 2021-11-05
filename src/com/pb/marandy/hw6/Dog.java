package com.pb.marandy.hw6;

import java.util.Objects;

public class Dog extends Animal{
    int age;
    public Dog(String name, String food, String location, int age) {
        super(name, food, location);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void makeNoise() {
        System.out.println("Гав-Гав!");
    }

    public void eat(){
        System.out.println(getName() + " ест");
    }
    public String toString(){
        return  "Собака: кличка = "+ getName()+" еда = "+getFood()+" нахождение = "+getLocation()+" возраст = "+getAge();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return age == dog.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }
}