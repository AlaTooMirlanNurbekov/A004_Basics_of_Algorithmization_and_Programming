/*
 * Task 0050 : library book class (borrow and return)
 *
 * Description:
 * This task models a simple library system using a Book class. Each book has:
 * - title
 * - author
 * - availability status (available or borrowed)
 *
 * The program:
 * - creates a Book object from user input
 * - allows the user to borrow the book (if available)
 * - allows the user to return the book (if it was borrowed)
 * - prints the current status after each operation
 *
 * Concept explained:
 * - defining a class with fields and methods
 * - using boolean values to track state (available / not available)
 * - modeling a small real-world system with objects
 *
 * This task shows how object-oriented programming can be used to represent
 * everyday scenarios like a library. The same idea can later be extended to
 * handle many books, users, and full systems.
 */

import java.util.Scanner;

class Book {
    String title;
    String author;
    boolean isAvailable;

    // constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;  // new book starts as available
    }

    public void borrow() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have borrowed: \"" + title + "\"");
        } else {
            System.out.println("Sorry, this book is already borrowed.");
        }
    }

    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("You have returned: \"" + title + "\"");
        } else {
            System.out.println("This book was not borrowed.");
        }
    }

    public void printInfo() {
        System.out.println("\nBook Info:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter book title: ");
        String title = sc.nextLine();

        System.out.print("Enter book author: ");
        String author = sc.nextLine();

        Book book = new Book(title, author);

        while (true) {
            book.printInfo();

            System.out.println("\nMenu:");
            System.out.println("1. Borrow book");
            System.out.println("2. Return book");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();

            if (choice == 1) {
                book.borrow();
            } else if (choice == 2) {
                book.returnBook();
            } else if (choice == 3) {
                System.out.println("Exiting program...");
                break;
            } else {
                System.out.println("Invalid option.");
            }
        }
    }
}
