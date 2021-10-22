package com.pb.marandy.hw3;

import java.math.*;
import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static Scanner in = new Scanner(System.in);
    int[] array = new int[10];

    public static void main(String[] args) {
        Array Go = new Array();
        Go.Enter();
        Go.Sum1();
        Go.Sum2();
        Go.Sort();
    }

    public void Enter() {
        System.out.println("Введите 10 чисел для массива: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите array [" + i + "] = ");
            array[i] = in.nextInt();
        }
        System.out.print("Введенный массив чисел: ");
        for (int x = 0; x < array.length; x++) {
            System.out.print(array[x] + " ");
        }
    }

    public int Sum1() {
        int sum1 = Arrays.stream(array).sum();
        System.out.println("\nСумма всех элементов массива = " + sum1);
        return sum1;
    }

    public int Sum2() {
        int sum2 = 0;
        for (int y = 0; y < array.length; y++) {
            if (array[y] > 0) sum2 += array[y];
        }
        System.out.println("Сумма всех положительных элементов массива = " + sum2);
        return sum2;
    }

    public void Sort() {
        boolean sort = false;
        int change;
        while (!sort) {
            sort = true;
            for (int z=0; z<array.length-1;z++) {
                if (array[z]>array[z+1]) {
                    sort = false;
                    change = array[z];
                    array[z]=array[z+1];
                    array[z+1]=change;
                }
            }
        }
        System.out.println("Отсортированный массив пузырьковым методом: ");
        for (int a = 0;a<array.length;a++) {
            System.out.print(array[a] + " ");
        }
    }
}
