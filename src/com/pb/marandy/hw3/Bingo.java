package com.pb.marandy.hw3;
import java.util.Scanner;
public class Bingo {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int UnkownNum, UserNum, count = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Ваша задача угадать число от 1 до 100. Если хотите закончить игру, введите \"1234\"");
        UnkownNum = (int) (Math.random() * 100);
        while (true) {
            count++;
            System.out.println("Введите число: ");
            UserNum = in.nextInt();
            if (UserNum == 1234) {
                System.out.println("Игра окончена");
                break;
            } else if (UserNum < UnkownNum) {
                System.out.println("Задуманное число больше вводимого");
            } else if (UserNum > UnkownNum) {
                System.out.println("Задуманное число меньше вводимого");
            } else if (UserNum == UnkownNum) {
                System.out.println("Вы угадали это было число: " + UnkownNum + " Количество попыток: " + count);
                break;
            }
        }
    }
}