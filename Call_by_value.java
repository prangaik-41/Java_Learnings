class Test {
    int math(int i , int j){
        i = i*2;
        j = j / 2;
        return i+j;
    }
    
}
class Call_by_value{
    public static void main(String args[]) {
        Test ob = new Test();  //CReate a new memory or object 
        int a = 15;
        int b = 20;
        System.out.println("a and b before call: "+a+" "+b);
        int result = ob.math(a,b);
   
        System.out.println("a and b After call: "+a+" "+b);
    }
}