class Test {
    int a,b;
    
    Test(int i, int j){
        a = i;
        b = j;
    }
    //theri is no return step in the previous function 
    // void is only works when theri is a return statement
    void math(Test o){
        o.a = o.a * 2;
        o.b = o.b / 2;
    }
}

class CallByReference{
    public static void main(String args[]) {
        Test ob = new Test(12, 7);
        System.out.println("ob.a and ob.b before Call: " + ob.a+ " " + ob.b);
        ob.math(ob);
        System.out.println("ob.a and ob.b After Call: " + ob.a+ " " + ob.b);
    }
}