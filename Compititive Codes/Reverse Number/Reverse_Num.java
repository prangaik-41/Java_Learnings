package Compititive Codes.Reverse Number;

import java.util.Scanner;


public class Reverse_Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result;
        while (num !=0){
            int digit = num %10;
            result = result * 10 + digit;
            num = num/10;    
        }
        System.out.println(result);
    }
    
}
