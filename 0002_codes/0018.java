import java.util.Scanner;

public class LongestIncreasingConsecutiveSubsequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of elements
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        // Read n integers from the user
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Find the length of the longest increasing consecutive subsequence
        int maxLength = 1; // Minimum length is 1
        int currentLength = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                currentLength++;
            } else {
                currentLength = 1; // Reset length when sequence breaks
            }
            if (currentLength > maxLength) {
                maxLength = currentLength;
            }
        }

        System.out.println("Length of the longest increasing consecutive subsequence: " + maxLength);
    }
}
