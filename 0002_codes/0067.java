/*
 * Task 0067 : infix to postfix conversion
 *
 * Description:
 * This task converts a mathematical expression from infix form to postfix form.
 * Infix form is the usual way we write expressions:
 *   A + B * C
 *
 * Postfix form (also called Reverse Polish Notation) writes operators after
 * their operands:
 *   A B C * +
 *
 * The program:
 * - reads an infix expression as a string
 * - supports operators: +, -, *, /
 * - supports parentheses: ( and )
 * - ignores spaces
 * - outputs the equivalent postfix expression
 *
 * Concept explained:
 * - using a stack to handle operators and parentheses
 * - applying operator precedence and associativity
 * - understanding how calculators and compilers can process expressions
 *
 * This task is a classic example of stack usage in algorithms and prepares
 * you for expression evaluation and parsing.
 */

import java.util.Scanner;
import java.util.Stack;

public class Main {
    // return precedence of an operator
    // higher number → higher precedence
    public static int precedence(char op) {
        if (op == '+' || op == '-') {
            return 1;
        }
        if (op == '*' || op == '/') {
            return 2;
        }
        return 0;
    }

    public static String infixToPostfix(String expr) {
        StringBuilder output = new StringBuilder();
        Stack<Character> ops = new Stack<>();

        for (int i = 0; i < expr.length(); i++) {
            char ch = expr.charAt(i);
            // ignore spaces
            if (ch == ' ') {
                continue;
            }
            // if operand (letter or digit), send directly to output
            if (Character.isLetterOrDigit(ch)) {
                output.append(ch);
                output.append(' '); // space to separate tokens
            }
            // opening parenthesis
            else if (ch == '(') {
                ops.push(ch);
            }
            // closing parenthesis: pop until '('
            else if (ch == ')') {
                while (!ops.isEmpty() && ops.peek() != '(') {
                    output.append(ops.pop());
                    output.append(' ');
                }
                if (!ops.isEmpty() && ops.peek() == '(') {
                    ops.pop(); // remove '('
                }
            }
            // operator
            else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                // while stack top has higher or equal precedence, pop it
                while (!ops.isEmpty() && precedence(ops.peek()) >= precedence(ch)
                        && ops.peek() != '(') {
                    output.append(ops.pop());
                    output.append(' ');
                }
                ops.push(ch);
            }
        }
        // pop any remaining operators
        while (!ops.isEmpty()) {
            output.append(ops.pop());
            output.append(' ');
        }

        return output.toString().trim();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter infix expression: ");
        String expr = sc.nextLine();
        String postfix = infixToPostfix(expr);
        System.out.println("Postfix expression: " + postfix);
    }
}
