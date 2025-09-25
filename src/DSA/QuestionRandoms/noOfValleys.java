package DSA.QuestionRandoms;

import java.util.Scanner;

public class noOfValleys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String steps = sc.next();

        int elevation = 0, valleys =0;
        for(char c : steps.toCharArray()){
            if(c == 'U'){
                elevation++;
                if(elevation == 0){
                    valleys++;
                }
            }
            else if(c == 'D'){
                elevation--;
            }
        }
        System.out.println(valleys);
    }
}
