public class swapTwoNumber{
    static void swapNumber(int a , int b){
        System.out.println("Original values before swaping");
        System.out.println("a : "+a);
        System.out.println("b : "+b);

        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("Values after swaping");
        System.out.println("a : "+a);
        System.out.println("b : "+b);
    }
    static void swapTwoNumberwithouttemp(int a, int b){
        System.out.println("Original values before swaping");
        System.out.println("a : "+a);
        System.out.println("b : "+b);

        // a = 3 b = 9
        a = a+b; // a =3+9  = 12
        b = a-b; //b = 12-9 = 3
        a = a-b; //a = 12-3 = 9
        
        System.out.println("Values after swaping");
        System.out.println("a : "+a);
        System.out.println("b : "+b);
    }
    public static void main(String args[]){
        int a = 3;
        int b = 9;
        swapNumber(a,b);
        swapTwoNumberwithouttemp(a,b);
    }
}