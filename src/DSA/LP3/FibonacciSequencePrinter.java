package DSA.LP3;

import java.util.Scanner;

public class FibonacciSequencePrinter {
    public static long recursive(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;
        return recursive(n-1) + recursive(n-2);
    }

    public static long iterative(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;
        long a = 0, b = 1;
        long c;
        for(int i = 2; i <= n; i++){
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        while(choice != 4){
            System.out.println("Enter 1 for Fibonacci Sequence number at your desired position using recursion");
            System.out.println("Enter 2 for Fibonacci Sequence number at your desired position using iterative function");
            System.out.println("Enter 3 for Fibonacci Sequence ");
            System.out.println("Enter 4 to exit");
            choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Enter the desired position");
                    System.out.println("Fibonacci number: " + recursive(sc.nextInt()));
                    break;
                case 2:
                    System.out.println("Enter the desired position");
                    System.out.println("Fibonacci number: " + iterative(sc.nextInt()));
                    break;
                case 3:
                    System.out.println("Enter the desired length of the Fibonacci sequence");
                    int length = sc.nextInt();  // Fixed: Store value before loop
                    long a = 0, b = 1, c;
                    System.out.println(a);
                    System.out.println(b);

                    for(int i = 2; i < length; i++){  // Fixed: Use stored variable
                        c = a + b;
                        a = b;
                        b = c;
                        System.out.println(b);
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
        sc.close();
    }
}
