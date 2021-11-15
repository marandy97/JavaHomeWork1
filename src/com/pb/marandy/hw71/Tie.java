package com.pb.marandy.hw71;

public class Tie extends Clothes implements ManClothes{
    static String name = "Галстук";

    public Tie(Size size, int cost, String color) {
        super(size, cost, color);
    }

    public void dressMan(){
        System.out.println(name+" "+size.getDescription()+" "+size.getEuroSize()+" Цена: "+cost+" Цвет: "+color);
    }
}
