/*
 * Task 0054 : sort students by GPA
 *
 * Description:
 * This task combines arrays, sorting, and object-oriented programming.
 * The program:
 * - defines a Student class with name, ID, and GPA
 * - asks the user how many students there are
 * - reads all student data into an array
 * - sorts the students by GPA in descending order (highest first)
 * - prints the sorted list
 *
 * Concept explained:
 * - storing objects inside an array
 * - comparing object fields (GPA) instead of primitive values
 * - sorting based on a custom rule
 *
 * Sorting objects is a very common task in real applications: ranking students
 * by grades, sorting products by price, or listing players by score.
 */

import java.util.Scanner;

class Student {
    String name;
    String id;
    double gpa;
}

public class Main {

    public static void sortByGpaDescending(Student[] students) {
        int n = students.length;

        // simple bubble sort on GPA (descending)
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (students[j].gpa < students[j + 1].gpa) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }

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

        sortByGpaDescending(students);

        System.out.println("\nStudents sorted by GPA (highest first):");
        for (Student s : students) {
            System.out.println(s.name + " | ID: " + s.id + " | GPA: " + s.gpa);
        }
    }
}
