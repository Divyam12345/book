package main;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine().trim();
        Book[] books = new Book[n];
        if (n == 0) {
            System.out.println("N/A");
        } else {
            for (int i = 0; i < n; i++) {
                String BookName = scanner.nextLine().trim();
                String AuthorName = scanner.nextLine().trim();
                String IsbnNumber = scanner.nextLine();
                books[i] = new Book(BookName, AuthorName, IsbnNumber);
            }
            for (int j = 0; j < n; j++) {
                System.out.println(books[j]);
            }
            scanner.close();
        }

    }
}

class Book {
    private String bookName;
    private String authorName;
    private String isbn;

    Book(String bookName, String authorName, String isbn) {
        this.authorName = authorName;
        this.bookName = bookName;
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "-----------------------------\n" + "Book Name:\t" + bookName + "\nAuthor Name:\t" + authorName + "\nISBN:\t" + isbn +
                "\n-----------------------------";

    }

}
