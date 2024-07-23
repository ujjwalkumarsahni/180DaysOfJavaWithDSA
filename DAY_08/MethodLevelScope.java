// package DAY_08;

class Algebra{
    int a = 10;
    int b = 3; // class level scope 
    int Add(){
        int p = 20;
        int q = 24; // Method Level Scope access only within method 
        return p+q;
    }
    int sub(){
        int p = 2000;
        int q = 4;
        return p-q;
    }
}

public class MethodLevelScope {
    public static void main(String args[]){
        Algebra obj1 = new Algebra();


        System.out.println(obj1.Add());
        System.out.println(obj1.sub());
    }
}
