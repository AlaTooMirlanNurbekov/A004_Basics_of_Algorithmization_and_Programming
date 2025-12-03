 // Task 0065 : caesar cipher decryption
 /*
 * Description:
 * This task asks the user to enter an encrypted message and a shift value.
 * The program then *decrypts* the message by shifting each letter backward in
 * the alphabet by the given amount. For example, with shift = 3:
 * D → A, E → B, F → C, ...
 */
 /* The program:
 * - reverses the Caesar cipher rotation
 * - keeps upper and lower case letters correct
 * - leaves spaces and punctuation unchanged
 * - wraps around the alphabet (A shifted backward becomes Z)
 *
 * Concept explained:
 * - reversing a substitution cipher
 * - using modular arithmetic on characters
 * - handling uppercase and lowercase correctly
 *
 * This task completes the Caesar cipher pair (encryption + decryption) and
 * provides a simple demonstration of basic classical cryptography.
 */

import java.util.Scanner;

public class Main {

    public static String decryptCaesar(String text, int shift) {
        StringBuilder result = new StringBuilder();
        // normalize shift to 0–25
        shift = shift % 26;
        if (shift < 0) {
            shift += 26;
        }
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            // decrypt uppercase
            if (ch >= 'A' && ch <= 'Z') {
                int base = 'A';
                char dec = (char) (base + (ch - base - shift + 26) % 26);
                result.append(dec);
            }
            // decrypt lowercase
            else if (ch >= 'a' && ch <= 'z') {
                int base = 'a';
                char dec = (char) (base + (ch - base - shift + 26) % 26);
                result.append(dec);
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

        System.out.print("Enter message to decrypt: ");
        String encrypted = sc.nextLine();

        System.out.print("Enter shift value used for encryption: ");
        int shift = sc.nextInt();
        String decrypted = decryptCaesar(encrypted, shift);
        System.out.println("Decrypted message: " + decrypted);
    }
}
