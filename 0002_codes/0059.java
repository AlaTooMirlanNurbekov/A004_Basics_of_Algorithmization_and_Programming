/*
 * Task 0059 : search for a value in a binary search tree (BST)
 *
 * Description:
 * This task allows the user to build a binary search tree by entering values,
 * and then search for a specific target value. The program reports whether the
 * value exists in the tree.
 *
 * Concept explained:
 * - using recursion to search in a BST
 * - applying BST rules:
 *   - if target < root → search left
 *   - if target > root → search right
 * - returning true when the value is found
 *
 * Searching in a BST is efficient because the tree divides the search space
 * similar to binary search. This is the foundation for many larger data
 * structures like red-black trees and AVL trees.
 */

import java.util.*;
// binary tree node
class Node {
    int value;
    Node left, right;

    public Node(int value) {
        this.value = value;
    }
}

public class Main {

    // binary search tree insert
    public static Node insert(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }

        if (value < root.value) {
            root.left = insert(root.left, value);
        } else if (value > root.value) {
            root.right = insert(root.right, value);
        }

        return root;
    }

    // recursive search
    public static boolean search(Node root, int target) {
        if (root == null) {
            return false;  // not found
        }

        if (root.value == target) {
            return true;   // found
        }

        if (target < root.value) {
            return search(root.left, target);
        } else {
            return search(root.right, target);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Node root = null;

        System.out.print("Enter number of values to insert into BST: ");
        int n = sc.nextInt();

        System.out.println("Enter values:");
        for (int i = 0; i < n; i++) {
            root = insert(root, sc.nextInt());
        }

        System.out.print("Enter value to search for: ");
        int target = sc.nextInt();

        if (search(root, target)) {
            System.out.println("Value " + target + " found in the BST.");
        } else {
            System.out.println("Value " + target + " NOT found in the BST.");
        }
    }
}
