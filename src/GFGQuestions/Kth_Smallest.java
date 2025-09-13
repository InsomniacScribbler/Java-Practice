package GFGQuestions;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Kth_Smallest {
        static int kthSmallest(int[] arr, int k) {
            // Your code here
            PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b-a);
            for(int num : arr){
                pq.offer(num);
                if(pq.size() > k)  pq.poll();
            }
            return pq.peek();
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println(kthSmallest(arr, k));
        sc.close();
    }

}
