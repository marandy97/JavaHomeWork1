package com.pb.marandy.hw6;

public class Veterinarian {
    public void treatAnimal (Animal animal){
        System.out.println(animal.getName()+" "+animal.getFood() + " "+ animal.getLocation());
    }
}