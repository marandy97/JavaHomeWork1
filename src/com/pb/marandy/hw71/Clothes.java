package com.pb.marandy.hw71;

public abstract class  Clothes {
    Size size;
    int cost;
    String color;

    public Clothes(Size size, int cost, String color) {
        this.size = size;
        this.cost = cost;
        this.color = color;
    }
}
