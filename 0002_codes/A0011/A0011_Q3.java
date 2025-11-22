import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q3KMP {

    // In this solution I use the KMP algorithm.
    // The prefix table (LPS array) tells me how much of the pattern is already matched,
    // so on a mismatch I can jump forward without re-checking all characters.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter main text: ");
        String text = scanner.nextLine();

        System.out.print("Enter pattern: ");
        String pattern = scanner.nextLine();

        List<Integer> positions = kmpSearch(text, pattern);

        if (positions.isEmpty()) {
            System.out.println("Pattern not found.");
        } else {
            System.out.println("Pattern found at positions (0-based): " + positions);
        }
    }

    private static List<Integer> kmpSearch(String text, String pattern) {
        List<Integer> result = new ArrayList<>();
        if (pattern.isEmpty()) {
            return result;
        }

        int[] lps = buildLps(pattern);

        int i = 0; // index in text
        int j = 0; // index in pattern

        while (i < text.length()) {
            if (text.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;

                if (j == pattern.length()) {
                    // full match found, store starting index
                    result.add(i - j);
                    j = lps[j - 1]; // continue with next possible match
                }
            } else {
                if (j > 0) {
                    // use LPS to avoid re-checking characters
                    j = lps[j - 1];
                } else {
                    i++; // no prefix to fall back to
                }
            }
        }

        return result;
    }

    // builds the prefix table (LPS = longest proper prefix which is also suffix)
    private static int[] buildLps(String pattern) {
        int[] lps = new int[pattern.length()];
        int len = 0; // length of current longest prefix-suffix
        int i = 1;

        while (i < pattern.length()) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len > 0) {
                    len = lps[len - 1]; // fall back to previous prefix length
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }

        return lps;
    }
}
