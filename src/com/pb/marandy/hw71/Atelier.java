package com.pb.marandy.hw71;

public class Atelier {
    public static void main(String[] args) {
        Clothes[] clothes = new Clothes[4];
        clothes[0] = new Pants(Size.M, 800, "черный");
        clothes[1] = new Tshirt(Size.S, 500, "белый");
        clothes[2] = new Tie(Size.XS, 300, "серый");
        clothes[3] = new Skirt(Size.S, 600, "красный");
        dressMan(clothes);
        dressWomen(clothes);
    }

    static void dressMan(Clothes[] clothes) {
        System.out.println("Одежда для мужчин: ");
        for (Clothes element : clothes) {
            if (element instanceof ManClothes) {
                ((ManClothes) element).dressMan();
            }
        }
    }

    static void dressWomen(Clothes[] clothes) {
        System.out.println("Одежда для женщин: ");
        for (Clothes element : clothes) {
            if (element instanceof WomenClothes) {
                ((WomenClothes) element).dressWomen();
            }
        }
    }
}
