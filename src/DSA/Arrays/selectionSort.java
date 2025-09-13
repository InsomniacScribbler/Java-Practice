package DSA.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class selectionSort {
    static void selectionSort(int[] arr){
        int temp = 0;
        for(int i=0;i<arr.length;i++){
            int minIdx =i;

            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    minIdx = j;
                }
                temp = arr[i];
                arr[i] = arr[minIdx];
                arr[minIdx] = temp;

            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
