package interview_questions.copy;
import java.util.Scanner;

public class ValueSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking array input from the user
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] a = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        // Taking the value to be searched
        System.out.print("Enter the value to search for: ");
        int valueToSearch = scanner.nextInt();

        // Searching for the value in the array
        boolean found = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == valueToSearch) {
                System.out.println("Value " + valueToSearch + " found at index " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Value " + valueToSearch + " not found in the array.");
        }

        scanner.close();
    }
}