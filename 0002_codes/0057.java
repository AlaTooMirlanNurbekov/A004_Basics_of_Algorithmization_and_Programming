/*
 * Task 0057 : binary tree traversals (inorder, preorder, postorder)
 *
 * Description:
 * This task builds on the binary tree node structure. The program creates a
 * small binary tree and then prints the nodes in three different traversal orders:
 *
 * - Preorder  (root, left, right)
 * - Inorder   (left, root, right)
 * - Postorder (left, right, root)
 *
 * Concept explained:
 * - using recursion to walk through a tree
 * - understanding different traversal orders and their patterns
 * - seeing how the same tree can be viewed in multiple ways
 *
 * Tree traversal is a fundamental operation used in searching, expression
 * evaluation, serialization, and many other algorithms that work on trees.
 */

import java.util.*;

// binary tree node
class Node {
    int value;
    Node left;
    Node right;
    public Node(int value) {
        this.value = value;
    }
}

public class Main {

    // preorder: root, left, right
    public static void preorder(Node root) {
        if (root == null) return;
        System.out.print(root.value + " ");
        preorder(root.left);
        preorder(root.right);
    }
    // inorder: left, root, right
    public static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.value + " ");
        inorder(root.right);
    }

    // postorder: left, right, root
    public static void postorder(Node root) {
        if (root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.value + " ");
    }

    public static void main(String[] args) {
        /*
         * build this sample tree:
         *
         *        10
         *       /  \
         *      5    15
         *     / \     \
         *    2   7     20
         */
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(2);
        root.left.right = new Node(7);
        root.right.right = new Node(20);

        System.out.print("Preorder traversal: ");
        preorder(root);
        System.out.println();
        System.out.print("Inorder traversal: ");
        inorder(root);
        System.out.println();
        System.out.print("Postorder traversal: ");
        postorder(root);
        System.out.println();
    }
}
