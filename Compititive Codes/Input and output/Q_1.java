import java.util.Scanner;

public class Q_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.println("Enter Roll Number: ");
        int rollNo = sc.nextInt();

        System.out.println("Enter Marks: ");
        double marks = sc.nextDouble();

        System.out.println("\n----Student Details----");
        System.out.println("Name     :%s%n", name);
        System.out.println("Roll No : 5d%n");

    }
}