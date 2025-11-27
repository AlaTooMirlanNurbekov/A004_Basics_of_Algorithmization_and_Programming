import java.util.Arrays;
import java.util.Scanner;

public class Q2BinarySearch {

    // Here I use binary search because it cuts the search space in half each time.
    // This is much more efficient than checking elements one by one (linear search),
    // but it only works correctly on sorted arrays.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " integers (can be unsorted):");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // make sure array is sorted before applying binary search
        Arrays.sort(arr);

        System.out.print("Enter number to search for: ");
        int target = scanner.nextInt();

        int index = binarySearch(arr, target);

        if (index == -1) {
            System.out.println("Number not found.");
        } else {
            System.out.println("Number found at index (0-based): " + index);
        }
    }

    private static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                return mid; // found
            } else if (arr[mid] < target) {
                low = mid + 1; // search right half
            } else {
                high = mid - 1; // search left half
            }
        }

        return -1; // not found
    }
}

