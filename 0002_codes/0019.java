import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); }
        int mostFrequent = arr[0];
        int maxCount = 1;
        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;}}
            if (count > maxCount || (count == maxCount && arr[i] > mostFrequent)) {
                maxCount = count;
                mostFrequent = arr[i];}}
        System.out.println("Most frequent number: " + mostFrequent);
        System.out.println("It appears " + maxCount + " times.");
    }
}
