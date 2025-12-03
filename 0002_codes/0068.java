/*
 * Task 0068 : hash table with linear probing
 *
 * Description:
 * This task implements a very simple hash table for integer keys using
 * an array and linear probing for collision handling.
 *
 * The program:
 * - uses a fixed-size array as the hash table
 * - stores integer keys (no values, only keys)
 * - supports three operations through a menu:
 *   1) insert a key
 *   2) search for a key
 *   3) delete a key
 *
 * Hash function:
 *   index = key % TABLE_SIZE
 *
 * If a collision happens, linear probing is used:
 *   try index+1, index+2, ... (wrapping around) until a free slot is found.
 *
 * Concept explained:
 * - basic idea of hashing
 * - collisions and linear probing
 * - special markers for empty and deleted slots
 * - average O(1) time for insert/search/delete in a hash table
 *
 * This is a teaching example. Real hash table implementations are more
 * complex, but this gives you the core idea of how they work internally.
 */

import java.util.Scanner;

public class Main {

    // special markers for table slots
    private static final int EMPTY = -1;
    private static final int DELETED = -2;
    // u can adjust this size for experiments
    private static final int TABLE_SIZE = 10;
    private static int[] table = new int[TABLE_SIZE];

    // initialize table with EMPTY markers
    private static void initTable() {
        for (int i = 0; i < TABLE_SIZE; i++) {
            table[i] = EMPTY;
        }
    }
    // simple hash function
    private static int hash(int key) {
        key = Math.abs(key);
        return key % TABLE_SIZE;
    }

    // insert a key using linear probing
    private static void insert(int key) {
        int index = hash(key);
        for (int i = 0; i < TABLE_SIZE; i++) {
            int probeIndex = (index + i) % TABLE_SIZE;
            // place key in empty or deleted slot
            if (table[probeIndex] == EMPTY || table[probeIndex] == DELETED) {
                table[probeIndex] = key;
                System.out.println("Inserted key " + key + " at index " + probeIndex + ".");
                return;
            }
            // if key already exists, do nothing
            if (table[probeIndex] == key) {
                System.out.println("Key " + key + " already exists in the table.");
                return;
            }
        }

        System.out.println("Hash table is full. Could not insert key " + key + ".");
    }

    // search for a key using linear probing
    private static int search(int key) {
        int index = hash(key);

        for (int i = 0; i < TABLE_SIZE; i++) {
            int probeIndex = (index + i) % TABLE_SIZE;
            if (table[probeIndex] == EMPTY) {
                // if we hit an empty slot, the key is not in the table
                return -1;
            }
            if (table[probeIndex] == key) {
                return probeIndex;
            }
        }
        return -1;
    }

    // delete a key: mark slot as DELETED
    private static void delete(int key) {
        int pos = search(key);

        if (pos == -1) {
            System.out.println("Key " + key + " not found. Nothing to delete.");
        } else {
            table[pos] = DELETED;
            System.out.println("Key " + key + " deleted from index " + pos + ".");
        }
    }

    // display the current state of the table
    private static void displayTable() {
        System.out.println("\nHash table state:");
        for (int i = 0; i < TABLE_SIZE; i++) {
            if (table[i] == EMPTY) {
                System.out.println(i + " : EMPTY");
            } else if (table[i] == DELETED) {
                System.out.println(i + " : DELETED");
            } else {
                System.out.println(i + " : " + table[i]);
            }
        }
    }
    // 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        initTable();
        while (true) {
            System.out.println("\nHash Table Menu:");
            System.out.println("1. Insert key");
            System.out.println("2. Search key");
            System.out.println("3. Delete key");
            System.out.println("4. Display table");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.print("Enter key to insert: ");
                int key = sc.nextInt();
                insert(key);
            } else if (choice == 2) {
                System.out.print("Enter key to search: ");
                int key = sc.nextInt();
                int pos = search(key);
                if (pos == -1) {
                    System.out.println("Key " + key + " not found.");
                } else {
                    System.out.println("Key " + key + " found at index " + pos + ".");
                }
            } else if (choice == 3) {
                System.out.print("Enter key to delete: ");
                int key = sc.nextInt();
                delete(key);
            } else if (choice == 4) {
                displayTable();
            } else if (choice == 5) {
                System.out.println("Exiting program...");
                break;
            } else {
                System.out.println("Invalid option.");
            }
        }
    }
}
