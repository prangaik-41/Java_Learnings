import java.util.*;  //For takung the inputes from the User 

public class Factorial{
    public static void main(String args[]){  
        Scanner sc = new Scanner(System.in);  
        int n = sc.nextInt();
        int i = 1;
        int f = 1;
        for (i = 1; i<=n;i++){
            f=f*i;
        }
    System.out.println(f);
    }
}

