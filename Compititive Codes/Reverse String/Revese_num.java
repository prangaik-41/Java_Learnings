import java.util.Scanner;

public class Revese_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1 ; i<=n ; i++){
            for (int j = i ; j>=1 ; j--){
                System.out.println(j);
            }
            System.out.println();
        }

    }
    
}
