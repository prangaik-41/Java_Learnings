//Prent Class

class animal{
    void dog(){  //dog class
        System.out.println("Bark.....");
    }
    void cat(){
         System.out.println("Meaooo....");
    }
}

//Child Class

class human extends animal{ //Using Keyword "Extends" 
    void man(){
        System.out.println("Helloooo....");
    }

}

//Boss Class

public class Inheritance {
    public static void main(String[] args) {
        human ob = new human(); // Calling New memmory Cell And Calling Human class 
        ob.dog();
        ob.man();
    }
}
