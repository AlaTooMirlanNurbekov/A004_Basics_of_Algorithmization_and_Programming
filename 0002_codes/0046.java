/*
 * Task 0046 : student class (basic OOP)
 *
 * Description:
 * This task introduces basic object-oriented programming. You will create a
 * simple Student class with three fields:
 * - name
 * - id
 * - GPA
 *
 * The program creates a Student object, stores user input inside it, and then
 * prints all the details. This demonstrates how classes represent real-world
 * things in programming.
 *
 * Concept explained:
 * - defining a class with fields
 * - creating objects using the "new" keyword
 * - assigning values to object fields
 * - accessing object data from the main method
 *
 * This task is the first step toward understanding OOP, which forms the
 * foundation of Java programming.
 */

import java.util.Scanner;

// student blueprint
class Student {
    String name;
    String id;
    double gpa;
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s = new Student();

        System.out.print("Enter student name: ");
        s.name = sc.nextLine();

        System.out.print("Enter student ID: ");
        s.id = sc.nextLine();

        System.out.print("Enter student GPA: ");
        s.gpa = sc.nextDouble();

        System.out.println("\nStudent Details:");
        System.out.println("Name: " + s.name);
        System.out.println("ID: " + s.id);
        System.out.println("GPA: " + s.gpa);
    }
}
