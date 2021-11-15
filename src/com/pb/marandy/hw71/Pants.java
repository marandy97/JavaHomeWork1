package com.pb.marandy.hw71;

public class Pants extends Clothes implements ManClothes, WomenClothes{
    static String name = "Штаны";

    public Pants(Size size, int cost, String color) {
        super(size, cost, color);
    }

    public void dressMan(){
        System.out.println(name+" "+size.getDescription()+" "+size.getEuroSize()+" Цена: "+cost+" Цвет: "+color);
    }
    public void dressWomen(){
        System.out.println(name+" "+size.getDescription()+" "+size.getEuroSize()+" Цена: "+cost+" Цвет: "+color);
    }
}
