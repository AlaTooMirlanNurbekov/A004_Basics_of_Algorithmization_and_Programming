/*
 * Task 0055 : find student with highest GPA
 *
 * Description:
 * This task asks the user to enter information for several students. Each student
 * has a name, an ID, and a GPA. After reading all the data, the program finds the
 * student with the highest GPA and prints their full details.
 *
 * Concept explained:
 * - storing objects inside an array
 * - scanning the array to compare GPA values
 * - tracking the current best student
 * - printing object data in a clean format
 *
 * This task shows how to process and analyze a collection of objects, which is a
 * very common requirement in real applications such as ranking, sorting, and
 * report generation.
 */

import java.util.Scanner;

class Student {
    String name;
    String id;
    double gpa;
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // clear buffer

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            students[i] = new Student();

            System.out.println("\nStudent " + (i + 1) + ":");

            System.out.print("Name: ");
            students[i].name = sc.nextLine();

            System.out.print("ID: ");
            students[i].id = sc.nextLine();

            System.out.print("GPA: ");
            students[i].gpa = sc.nextDouble();
            sc.nextLine(); // clear buffer
        }

        // find student with highest GPA
        Student topStudent = students[0];

        for (Student s : students) {
            if (s.gpa > topStudent.gpa) {
                topStudent = s;
            }
        }

        System.out.println("\nStudent with highest GPA:");
        System.out.println("Name: " + topStudent.name);
        System.out.println("ID: " + topStudent.id);
        System.out.println("GPA: " + topStudent.gpa);
    }
}
