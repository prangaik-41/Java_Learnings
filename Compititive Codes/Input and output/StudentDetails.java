import java.util.Scanner;
public class StudentDetails {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter Student Name: ");
String name = sc.nextLine();
System.out.print("Enter Roll Number: ");
int rollNo = sc.nextInt();
System.out.print("Enter Marks: ");
double marks = sc.nextDouble();
System.out.println("\n----- Student Details -----");
System.out.printf("Name : %s%n", name);
System.out.printf("Roll No : %d%n", rollNo);
System.out.printf("Marks : %.2f%n", marks);
sc.close();
}
}