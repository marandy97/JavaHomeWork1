package com.pb.marandy.hw71;

public class Tshirt extends Clothes implements ManClothes, WomenClothes {
    static String name = "Футболка";

    public Tshirt(Size size, int cost, String color) {
        super(size, cost, color);
    }

    public void dressMan(){
        System.out.println(name+" "+size.getDescription()+" "+size.getEuroSize()+" Цена: "+cost+" Цвет: "+color);
    }
    public void dressWomen(){
        System.out.println(name+" "+size.getDescription()+" "+size.getEuroSize()+" Цена: "+cost+" Цвет: "+color);
    }
}
