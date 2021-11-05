package com.pb.marandy.hw6;

public class VetClinic {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Scooby-Doo","кость","двор",7);
        animals[1]= new Cat("Василь","рыба","дом",5);
        animals[2] = new Horse("Плотва","морковь","луг","Серый");
        System.out.println("Все животные: ");
        for (Animal a:animals) {
            System.out.println(a);
        }
        Class clazz = Class.forName("com.pb.marandy.hw6.Veterinarian");
        Veterinarian veterinarian =(Veterinarian) clazz.newInstance();
        System.out.println("К ветеринару пришли: ");
        for (Animal someAnimal:animals) {
            veterinarian.treatAnimal(someAnimal);
        }
    }
}

