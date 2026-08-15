import java.util.Scanner;

public class Statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n%2==0){
            System.out.println("Divisible by 2");
        }else if(n%3 == 0){
            System.out.println("Divisible by 3");
        }else{
            System.out.println("Not divisible by 2 and 3");
        }
    }
}
