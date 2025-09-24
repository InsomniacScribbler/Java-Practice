package DSA.QuestionRandoms;
import java.util.*;
public class nPrimeNumberTillX {
    static boolean isPrime(int n){
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;

        // Check divisors from 5 to √n, skipping even numbers
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int count=0;
        for(int i =1; i<x+1;i++){
            if(count==n) break;
            if(isPrime(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
    }
}
