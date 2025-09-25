package DSA.QuestionRandoms;

import java.util.*;

public class totalNoOfTyres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // number of dealerships
        int [][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();

        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i][0]*4 +  arr[i][1]*2);
        }

        sc.close();
    }
}
