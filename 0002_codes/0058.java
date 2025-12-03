/*
 * Task 0058 : insert a value into a binary search tree (BST)
 *
 * Description:
 * This task introduces insertion in a binary search tree. A BST follows the rule:
 * - smaller values go to the left
 * - larger values go to the right
 *
 * The program:
 * - creates an empty BST
 * - inserts values entered by the user
 * - prints an inorder traversal to show the final sorted structure
 *
 * Concept explained:
 * - using recursion to insert nodes into a BST
 * - maintaining the BST ordering rules
 * - verifying the result using inorder traversal (sorted output)
 *
 * BST insertion is the foundation for searching, deleting, and balancing trees.
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
    // insert a new value into BST
    public static Node insert(Node root, int value) {
        if (root == null) {
            return new Node(value);  // new node created
        }
        if (value < root.value) {
            root.left = insert(root.left, value);
        } else if (value > root.value) {
            root.right = insert(root.right, value);
        }
        return root;
    }

    // inorder traversal: left, root, right
    public static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.value + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Node root = null;
        System.out.print("Enter number of values to insert: ");
        int n = sc.nextInt();

        System.out.println("Enter values:");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            root = insert(root, val);
        }
        System.out.print("BST inorder traversal: ");
        inorder(root);
    }
}
