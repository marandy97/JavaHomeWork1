package com.pb.marandy.hw5;

public class Library {
    public static void main(String[] args) {
        Book[] books = new Book[3];
        Reader[] readers = new Reader[3];
        books[0] = new Book("Приключения", "Иванов И. И.", "2000 г.");
        books[1] = new Book("Словарь", "Сидоров А. В.", "1980 г.");
        books[2] = new Book("Энциклопедия", "Гусев К. В.", "2010 г.");
        readers[0] = new Reader("Иванов С.В.", "1234", "Economic", "08.04.1997", "+380777777777");
        readers[1] = new Reader("Петров Д.В.", "4321", "Economic", "08.04.1997", "+380007777777");
        readers[2] = new Reader("Серов А.Д.", "1498", "History", "20.04.1989", "+380147801493880");
        System.out.println("All books: ");
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getTitle() + " " + books[i].getAuthor() + " " + books[i].getYear());
        }
        System.out.println("\n"+"All readers: ");
        for (int i = 0; i < readers.length; i++) {
            System.out.println(readers[i].getFullName()+" "+readers[i].getNumber()+" "+readers[i].getFaculty()+" "+readers[i].getDateOfBirth()+" "+readers[i].getTelephone());
        }

        readers[0].takeBook(2);
        readers[0].takeBook("Словарь","Энциклопедия");
        readers[0].takeBook(books[1],books[2]);
        System.out.println("");
        readers[0].returnBook(2);
        readers[0].returnBook("Словарь","Энциклопедия");
        readers[0].returnBook(books[1],books[2]);
    }
}