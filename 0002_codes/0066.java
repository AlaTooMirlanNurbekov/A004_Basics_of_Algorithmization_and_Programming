/*
 * Task 0066 : expression evaluation using stacks
 * Description:
 * This task asks the user to enter a mathematical expression like:
 *  3 + 5 * (2 - 1)
 * The program evaluates the expression and prints the result.
 *
 * The expression can contain:
 * - integers (positive, multi-digit)
 * - operators: +, -, *, /
 * - parentheses: ( and )
 * - spaces (which are ignored)
 *
 * The algorithm uses two stacks:
 * - one stack for numbers
 * - one stack for operators
 *
 * Concept explained:
 * - expression evaluation using data structures
 * - operator precedence (* and / before + and -)
 * - the role of parentheses in expressions
 * - using stacks to model how a calculator or compiler works
 *
 * This task gives a practical example of how real systems evaluate
 * arithmetic expressions step by step.
 */

import java.util.Scanner;
import java.util.Stack;

public class Main {

    // return precedence of an operator
    // higher value means higher precedence
    public static int precedence(char op) {
        if (op == '+' || op == '-') {
            return 1;
        }
        if (op == '*' || op == '/') {
            return 2;
        }
        return 0;
    }
    // apply an operator to two numbers
    public static int applyOp(int a, int b, char op) {
        switch (op) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                // simple integer division (no decimal handling here)
                return a / b;
            default:
                return 0;
        }
    }
    // evaluate expression using two stacks
    public static int evaluate(String expr) {
        Stack<Integer> values = new Stack<>();   // numbers
        Stack<Character> ops = new Stack<>();    // operators
        int i = 0;
        while (i < expr.length()) {
            char ch = expr.charAt(i);
            // ignore spaces
            if (ch == ' ') {
                i++;
                continue;
            }
            // if current character is a digit, read the full number
            if (Character.isDigit(ch)) {
                int num = 0;
                while (i < expr.length() && Character.isDigit(expr.charAt(i))) {
                    num = num * 10 + (expr.charAt(i) - '0');
                    i++;
                }
                values.push(num);
                continue; // continue without i++ here, already moved
            }
            // opening parenthesis
            if (ch == '(') {
                ops.push(ch);
            }
            // closing parenthesis: solve until matching '('
            else if (ch == ')') {
                while (!ops.isEmpty() && ops.peek() != '(') {
                    int b = values.pop();
                    int a = values.pop();
                    char op = ops.pop();
                    values.push(applyOp(a, b, op));
                }
                if (!ops.isEmpty() && ops.peek() == '(') {
                    ops.pop(); // remove '('
                }
            }
            // operator
            else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                // while top of ops has same or greater precedence, apply it
                while (!ops.isEmpty() && precedence(ops.peek()) >= precedence(ch)) {
                    int b = values.pop();
                    int a = values.pop();
                    char op = ops.pop();
                    values.push(applyOp(a, b, op));
                }
                ops.push(ch);
            }
            i++;
        }
        // apply remaining operators
        while (!ops.isEmpty()) {
            int b = values.pop();
            int a = values.pop();
            char op = ops.pop();
            values.push(applyOp(a, b, op));
        }
        // final result is on top of values stack
        return values.pop();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an expression: ");
        String expr = sc.nextLine();
        int result = evaluate(expr);
        System.out.println("Result: " + result);
    }
}
