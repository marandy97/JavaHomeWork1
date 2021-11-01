package com.pb.marandy.hw5;
public class Reader {
    private String FullName, Number, Faculty, DateOfBirth, Telephone;

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public String getFaculty() {
        return Faculty;
    }

    public void setFaculty(String faculty) {
        Faculty = faculty;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public String getTelephone() {
        return Telephone;
    }

    public void setTelephone(String telephone) {
        Telephone = telephone;
    }

    public Reader(String fullName, String number, String faculty, String dateOfBirth, String telephone) {
        FullName = fullName;
        Number = number;
        Faculty = faculty;
        DateOfBirth = dateOfBirth;
        Telephone = telephone;
    }
    public Reader(){

    }

    public void takeBook(int amount) {
        System.out.println("\n"+FullName + " взял " + amount + " книги.");
    }

    public void takeBook(String... title) {
        System.out.print(FullName + " взял книги: ");
        for (int i = 0; i < title.length; i++) {
            System.out.print(title[i] + " ");
        }
    }

    public void takeBook(Book... books) {
        System.out.print("\n"+FullName + " взял книги: ");
        for (int i = 0; i < books.length; i++) {
            System.out.print(books[i].getTitle() + " " + books[i].getAuthor() + " " + books[i].getYear() + " ");
        }
    }

    public void returnBook(int amount1) {
        System.out.println("\n"+FullName + " вернул " + amount1 + " книги.");
    }

    public void returnBook(String... title) {
        System.out.print(FullName + " вернул книги: ");
        for (int i = 0; i < title.length; i++) {
            System.out.print(title[i] + " ");
        }
    }

    public void returnBook(Book... books) {
        System.out.print("\n"+FullName + " вернул книги: ");
        for (int i = 0; i < books.length; i++) {
            System.out.print(books[i].getTitle() + " " + books[i].getAuthor() + " " + books[i].getYear() + " ");
        }
    }
}