import java.util.*; //importing the Java library to get the inputs and other in build functions

public class Question {
    public static void main(String[]args){
        Scanner ob = new Scanner(System.in);  //to get the input from the user 
        int a = ob.nextInt();  //stored in the integer value a
        int b = ob.nextInt();

        int sum = a + b ;
        System.out.print("Summation of a and b: " + sum);
    }
    
}
