package DSA.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

    static void insertionSort(int[] arr) {
        // Start from second element (index 1)
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];  // Current element to be inserted
            int j = i - 1;     // Index of last element in sorted portion

            // Shift elements greater than key to the right
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];  // Shift element to right
                j--;                   // Move to previous element
            }

            // Insert key at its correct position
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original array: " + Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        sc.close();
    }
}
