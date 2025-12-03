/*
 * Task 0049 : inheritance (person → student)
 *
 * Description:
 * This task introduces the concept of inheritance in object-oriented programming.
 * You will create a base class called Person with basic fields:
 * - name
 * - age
 *
 * Then you will create a Student class that inherits (extends) Person and adds:
 * - student ID
 * - GPA
 *
 * The program creates a Student object, fills in all fields, and prints the details.
 *
 * Concept explained:
 * - defining a parent class (Person)
 * - creating a child class (Student) using "extends"
 * - reusing fields and behavior from the parent class
 * - adding new fields to the child class
 *
 * Inheritance is one of the key principles of OOP. It helps reduce code
 * repetition and allows classes to build on existing structures.
 */

import java.util.Scanner;

// parent class
class Person {
    String name;
    int age;
}

// child class that inherits from Person
class Student extends Person {
    String studentId;
    double gpa;
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s = new Student();

        System.out.print("Enter name: ");
        s.name = sc.nextLine();

        System.out.print("Enter age: ");
        s.age = sc.nextInt();
        sc.nextLine();  // clear buffer

        System.out.print("Enter student ID: ");
        s.studentId = sc.nextLine();

        System.out.print("Enter GPA: ");
        s.gpa = sc.nextDouble();

        System.out.println("\nStudent Details:");
        System.out.println("Name: " + s.name);
        System.out.println("Age: " + s.age);
        System.out.println("ID: " + s.studentId);
        System.out.println("GPA: " + s.gpa);
    }
}
