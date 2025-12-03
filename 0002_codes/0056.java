/*
 * Task 0056 : binary tree node class
 *
 * Description:
 * This task introduces the basic structure of a binary tree by creating a simple
 * node class. Each node contains:
 * - a value
 * - a reference to the left child
 * - a reference to the right child
 *
 * The program:
 * - creates three nodes manually
 * - links them to form a small binary tree
 * - prints the values to confirm the structure
 *
 * Concept explained:
 * - defining a node class for a tree
 * - storing references to child nodes
 * - building a small tree manually
 *
 * Understanding how a node works is the foundation for all future tree topics:
 * traversal, searching, insertions, deletions, and balanced trees.
 */

import java.util.*;

class Node {
    int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

public class Main {
    public static void main(String[] args) {

        // creating individual nodes
        Node root = new Node(10);
        Node nodeA = new Node(5);
        Node nodeB = new Node(15);

        // linking nodes together
        root.left = nodeA;
        root.right = nodeB;

        System.out.println("Binary tree created.");
        System.out.println("Root: " + root.value);
        System.out.println("Left child: " + root.left.value);
        System.out.println("Right child: " + root.right.value);
    }
}
