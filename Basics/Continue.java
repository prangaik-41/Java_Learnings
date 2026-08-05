public class Continue{
    public static void main(String[] args) {
        for ( int i = 0 ; i<10 ; i ++){
            if (i==4){
                continue;  //it just not take the condition and conitnue whith the other 
            }
            System.out.println(i);
        }
    }
}