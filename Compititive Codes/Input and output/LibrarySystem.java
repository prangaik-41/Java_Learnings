import java.util.Scanner;

public class LibrarySystem {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("---Welcome to Library Management---");
            System.out.println("Books Available : 1.Science Fiction    2.Fairy Tails    3.Eduction");

            int categeory = sc.nextInt();

            String categeoryName;
            switch(categeory){
                case 1:categeoryName : "Science" ; 
                break;
                case 2:categeoryName :  "Fairy" ;
                break;
                case 3:categeoryName  :  "Eduction";
                break;
                


            }

    }
    
}
