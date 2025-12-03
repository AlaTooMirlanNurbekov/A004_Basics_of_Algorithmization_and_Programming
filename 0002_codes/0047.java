/*
 * Task 0047 : student class with methods (calculate average grade)
 *
 * Description:
 * This task builds on the previous one. The Student class now includes a method
 * that calculates the student's average grade based on three course marks
 * entered by the user.
 *
 * The program:
 * - creates a Student object
 * - reads student details
 * - reads three course grades
 * - calls a method to calculate the average grade
 * - prints all the information
 *
 * Concept explained:
 * - adding methods inside a class
 * - using object methods to process data
 * - separating logic into smaller, reusable parts
 *
 * This task helps you understand how classes can contain both data (fields)
 * and behavior (methods), which is the core idea of OOP.
 */

import java.util.Scanner;

// student blueprint with a method
class Student {
    String name;
    String id;
    double gpa;

    // method to calculate average of three grades
    public double calculateAverage(double g1, double g2, double g3) {
        return (g1 + g2 + g3) / 3.0;
    }
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

        System.out.print("Enter grade 1: ");
        double g1 = sc.nextDouble();

        System.out.print("Enter grade 2: ");
        double g2 = sc.nextDouble();

        System.out.print("Enter grade 3: ");
        double g3 = sc.nextDouble();

        double avg = s.calculateAverage(g1, g2, g3);

        System.out.println("\nStudent Details:");
        System.out.println("Name: " + s.name);
        System.out.println("ID: " + s.id);
        System.out.println("GPA: " + s.gpa);
        System.out.println("Average Grade: " + avg);
    }
}
