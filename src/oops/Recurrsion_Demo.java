package oops;

import java.util.Scanner;





public class Recurrsion_Demo {
	static int factorial (int n){
		if ( n == 1 || n == 0) return 1;

		else
			return n * factorial(n-1);


	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number whose factorial to be print :");
		int n = sc.nextInt();
		System.out.println(factorial(n));
	}
}
