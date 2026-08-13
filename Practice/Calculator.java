import java.util.Scanner;

public class Calculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("----Select the Oprator----");
        System.out.println("+ = 1\n- = 2\n* = 3\n/ = \n)");

        int op = sc.nextInt();

        if (op == 1){
            int add = num1 + num2;
            System.out.println("Addition of Numbers: ",add);
        }else if(op==2){
            int sub = num1 - num2;
            System.out.println("Substraction of Numbers: ",sub);
        }else if(op==3){
            int mul  = num1*num2;
            System.out.println("Multiplication of Numbers: ",mul);
        }
        else if(op==4){
            int div  = num1*num2;
            System.out.println("Multiplication of Numbers: ",div);
        }else{
            System.out.println("Incorrect Operator");
        }
    }
}