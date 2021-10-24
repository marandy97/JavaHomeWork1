package com.pb.marandy.hw4;
import java.util.Scanner;
public class CapitalLetter {
    public String str = null;
    public String outStr = null;

    public String out (String str) {
        for (int i = 0; i < (str.length()); i++) {

            if (str.charAt(i) == ' ') {

                outStr = outStr.substring(0, i + 1) + str.substring(i + 1, i + 2).toUpperCase() + str.substring(i + 2);

            } else if (i == 0) {

                outStr = str.substring(0, 1).toUpperCase() + str.substring(1);

            }
        }
        System.out.println("Ваше предложение: " + outStr);
        return outStr;
    }

    public static void main(String[] args) {
        CapitalLetter capitalLetter = new CapitalLetter();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите Ваше предложение: ");
        capitalLetter.str = sc.nextLine();
        capitalLetter.out(capitalLetter.str);
    }
}