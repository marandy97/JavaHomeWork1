package com.pb.marandy.hw8;

import java.util.Scanner;

public class OnlineShop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean check  = false;
        Auth auth = new Auth();
        System.out.println("Введите логин:");
        String login = in.nextLine();
        System.out.println("Введите пароль:");
        String password = in.nextLine();
        System.out.println("Повторите пароль:");
        String confirmPassword = in.nextLine();
        try {
            auth.signUp(login, password, confirmPassword);
            check  = true;
        } catch (WrongLoginException | WrongPasswordException e) {
            e.printStackTrace();
        }
        if (check ) {
            System.out.println("Чтобы войти на сайт введите логин:");
            String login1 = in.nextLine();
            System.out.println("Введите пароль:");
            String password1 = in.nextLine();
            try {
                auth.signIn(login1, password1);
            } catch (WrongLoginException e) {
                e.printStackTrace();
            }
        }
    }
}