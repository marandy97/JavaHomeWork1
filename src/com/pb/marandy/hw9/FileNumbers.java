package com.pb.marandy.hw9;

import java.io.*;

public class FileNumbers {
    File file = new File("D:/numbers.txt");
    File file1 = new File("D:/odd-numbers.txt");

    public void createNumbersFile() {
        int random;
        String str [] = new String[10];
        for (int i = 0; i < str.length; i++) {
            str[i] = "";
            for (int j = 0; j < str.length; j++) {
                str[i] += 1 + (int) (Math.random() * 100) + " ";
            }
            System.out.println(str[i]);
        }
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file);
            for (String element : str) {
                fileWriter.write(element + "\n");
            }
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void createOddNumbersFile() {
        try {
            FileWriter fileWriter1 = new FileWriter(file1);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String str1[] = new String[10];
            for (int x =0;x<str1.length;x++) {
                str1[x] = bufferedReader.readLine();
            }
            for (int i=0;i<str1.length;i++){
                String arr[] = str1[i].split(" ");
                int num[] = new int[arr.length];
                str1[i]="";
                    for (int j = 0; j < arr.length; j++) {
                        num[j] = Integer.parseInt(arr[j]);
                        if (num[j] % 2 == 0) {
                            num[j] = 0;
                        }
                        str1[i] += num[j] + " ";
                    }
                    fileWriter1.write(str1[i]+"\n");
                System.out.println(str1[i]);
                }
                bufferedReader.close();
                fileWriter1.close();
            } catch(Exception e){
                e.printStackTrace();
            }
        }

    public static void main(String[] args) {
        FileNumbers fileNumbers = new FileNumbers();
        System.out.println("Работа метода createNumbersFile: "+"\n");
        fileNumbers.createNumbersFile();
        System.out.println("\n"+"Работа метода createOddNumbersFile: "+"\n");
        fileNumbers.createOddNumbersFile();
    }
}
