package com.pb.marandy.hw4;

import java.util.Scanner;
public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1, s2;
        System.out.println("Введите первую строку: ");
        s1 = sc.nextLine();
        System.out.println("Введите вторую строку: ");
        s2 = sc.nextLine();
        //строка преобразовывается в символы
        char[] chArr1 = s1.toUpperCase().toCharArray();
        char[] chArr2 = s2.toUpperCase().toCharArray();
        Anagram anagram = new Anagram();
        String valueOfchar1 = String.valueOf(anagram.sort(chArr1));
        String valueOfchar2 = String.valueOf(anagram.sort(chArr2));
        if (valueOfchar1.equalsIgnoreCase(valueOfchar2)) {
            System.out.println("Это анаграмма");
        } else System.out.println("Это не анаграмма");
    }

    public char[] sort(char[] charr1) {
        String str="";
        for (char c:charr1){
            if (Character.isLetter(c)){
                str += c;
            }
        }
        charr1 = str.toCharArray();
        for (int i = charr1.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (charr1[j] > charr1[j + 1]) {
                    char tmp = charr1[j];
                    charr1[j] = charr1[j + 1];
                    charr1[j + 1] = tmp;
                }
            }
        }
        return charr1;
    }
}