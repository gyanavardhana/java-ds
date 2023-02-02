import java.util.Scanner;
import java.io.*;
/*
 * in this java program we are going to find the smallest sum for given nmber
 * we are going to divide the number using from 9 to 2 and based on the repetition we are going to find the number.
 */
public class smallsum {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        System.out.println(solution(n));
    }
    public static int solution(int n){
        String ans = "";
        for(int div=9; div>=2; div--){
            while (n%div == 0){
                n = n / div;
                ans = div + ans;
            }
        }
        if (n!=1){
            return -1;
        }else{
            return Integer.parseInt(ans);
        }

    }
    
}
