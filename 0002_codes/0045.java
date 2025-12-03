/*
 * Task 0045 : simple stack implementation (array-based)
 *
 * Description:
 * This task asks you to implement a basic stack using an array. A stack is a
 * last-in, first-out (LIFO) data structure. The program allows the user to:
 *
 * 1) push a value  
 * 2) pop a value  
 * 3) view the top value (peek)  
 * 4) display all stack elements  
 *
 * Concept explained:
 * - understanding how stack operations work (push, pop, peek)
 * - using an array and an index pointer to simulate a real stack
 * - checking conditions like stack overflow and underflow
 * - introducing the idea of abstract data types (ADTs)
 *
 * Stacks are widely used in function calls, undo operations, expression
 * evaluation, and many algorithmic problems.
 */

import java.util.Scanner;

public class Main {

    static int[] stack = new int[100];  // fixed size stack
    static int top = -1;

    // push operation
    public static void push(int value) {
        if (top == stack.length - 1) {
            System.out.println("Stack overflow. Cannot push more items.");
            return;
        }
        top++;
        stack[top] = value;
        System.out.println(value + " pushed to stack.");
    }

    // pop operation
    public static void pop() {
        if (top == -1) {
            System.out.println("Stack underflow. Nothing to pop.");
            return;
        }
        System.out.println(stack[top] + " popped from stack.");
        top--;
    }

    // peek operation
    public static void peek() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Top element: " + stack[top]);
        }
    }

    // display all elements
    public static void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nStack Menu:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    int value = sc.nextInt();
                    push(value);
                    break;
                case 2:
                    pop();
                    break;
                case 3:
                    peek();
                    break;
                case 4:
                    display();
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
