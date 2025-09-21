package DSA.QuestionRandoms;

import java.util.Scanner;

public class coPrimePairs {

    public static int gcd(int a, int b){
        if(b==0)  return a;
        return gcd(b,a%b);


    }
    public static void findCoPrimes(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (gcd(arr[i], arr[j]) == 1) {
                    System.out.println(arr[i] + " , " + arr[j] + " are co-prime");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        findCoPrimes(arr);
    }
}
