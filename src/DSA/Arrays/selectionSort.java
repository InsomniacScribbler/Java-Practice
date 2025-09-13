package DSA.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class selectionSort {
    static void selectionSort(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            int minIdx = i;

            // Find the minimum element in remaining unsorted array
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[minIdx]){  // Compare with arr[minIdx], not arr[i]
                    minIdx = j;
                }
            }

            // Swap the found minimum element with the first element
            // This should be OUTSIDE the inner loop
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Original array: " + Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        sc.close();
    }
}
