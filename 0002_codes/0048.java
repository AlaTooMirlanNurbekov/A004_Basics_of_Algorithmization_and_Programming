/*
 * Task 0048 : Bankaccount class (deposit and withdraw)
 *
 * Description:
 * This task introduces simple behavior inside a class. You will create a
 * BankAccount class that stores:
 * - account holder name
 * - account balance
 *
 * The class includes two methods:
 * - deposit(amount)
 * - withdraw(amount)
 *
 * The program creates a BankAccount object, reads user input, performs a
 * deposit and a withdrawal, and prints the updated balance.
 *
 * Concept explained:
 * - defining a class with fields and methods
 * - updating object data through method calls
 * - checking for valid withdrawals
 * - how objects represent real systems (banking model)
 *
 * This task helps you understand encapsulated behavior and how objects
 * manage their own data.
 */

import java.util.Scanner;

class BankAccount {
    String holderName;
    double balance;

    // deposit money
    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited.");
    }

    // withdraw money
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance. Withdrawal rejected.");
        } else {
            balance -= amount;
            System.out.println(amount + " withdrawn.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount account = new BankAccount();

        System.out.print("Enter account holder name: ");
        account.holderName = sc.nextLine();

        System.out.print("Enter initial balance: ");
        account.balance = sc.nextDouble();

        System.out.print("Enter deposit amount: ");
        double d = sc.nextDouble();
        account.deposit(d);

        System.out.print("Enter withdrawal amount: ");
        double w = sc.nextDouble();
        account.withdraw(w);

        System.out.println("\nFinal balance: " + account.balance);
    }
}
