package com.pb.marandy.hw71;

public class Skirt extends Clothes implements WomenClothes{
    static String name = "Юбка";

    public Skirt(Size size, int cost, String color) {
        super(size, cost, color);
    }

    public void dressWomen(){
        System.out.println(name+" "+size.getDescription()+" "+size.getEuroSize()+" Цена: "+cost+" Цвет: "+color);
    }
}
