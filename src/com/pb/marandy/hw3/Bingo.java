package com.pb.marandy.hw3;
import java.util.Scanner;
import java.lang.Math;
public class Bingo {
    public static void main(String[] args) {
        int UnknownNumber, UserNumber, Bing = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("ЗАДАЧА: Угадайте число (от 0 до 100).");
        UnknownNumber = (int)Math.floor(Math.random() * 100);
        do {
            Bing++;
            System.out.print("Введите ваше число: ");
            UserNumber = input.nextInt();
            if (UserNumber > UnknownNumber)
                System.out.println("Введите число меньше.");
            else if (UserNumber < UnknownNumber) System.out.println("Введите число больше.");	else System.out.println("Вы угадали!");
        } while (UserNumber != UnknownNumber);
        System.out.println("Количество попыток: " + Bing);
    }
}