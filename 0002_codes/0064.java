/*
 * Task 0064 : caesar cipher encryption
 *
 * Description:
 * This task asks the user to enter a message and a shift value. The program
 * encrypts the message using the Caesar cipher: each letter is shifted forward
 * in the alphabet by the given amount. For example, with shift = 3:
 * A → D, B → E, C → F, ...
 *
 * The program:
 * - keeps letters as letters (A–Z, a–z)
 * - keeps spaces and punctuation unchanged
 * - wraps around the alphabet (Z with shift 1 becomes A)
 *
 * Concept explained:
 * - working with characters and their ASCII/Unicode codes
 * - detecting uppercase and lowercase letters
 * - using modular arithmetic to wrap in the alphabet
 *
 * The Caesar cipher is a historical encryption method and a simple example
 * of substitution ciphers used in cryptography.
 */

import java.util.Scanner;

public class Main {

    public static String encryptCaesar(String text, int shift) {
        StringBuilder result = new StringBuilder();
        // normalize shift to be within 0–25
        shift = shift % 26;
        if (shift < 0) {
            shift += 26;
        }

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // encrypt uppercase letters
            if (ch >= 'A' && ch <= 'Z') {
                int base = 'A';
                char enc = (char) (base + (ch - base + shift) % 26);
                result.append(enc);
            }
            // encrypt lowercase letters
            else if (ch >= 'a' && ch <= 'z') {
                int base = 'a';
                char enc = (char) (base + (ch - base + shift) % 26);
                result.append(enc);
            }
            // leave other characters unchanged
            else {
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter message to encrypt: ");
        String message = sc.nextLine();
        System.out.print("Enter shift value (e.g., 3): ");
        int shift = sc.nextInt();
        String encrypted = encryptCaesar(message, shift);
        System.out.println("Encrypted message: " + encrypted);
    }
}
