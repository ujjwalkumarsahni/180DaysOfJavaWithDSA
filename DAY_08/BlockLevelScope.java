class Algebra6{
    int a = 10;
    int b = 3; // class level scope 
    int Add(){
        int p = 20;
        int q = 24; // Method Level Scope access only within method 
        {
            int x = 300;
            int y = 200;
            System.out.println(x+y);
        }
        return p+q;
    }
}


public class BlockLevelScope {
    public static void main(String args[]){
        Algebra6 obj1 = new Algebra6();
        System.out.println(obj1.Add());
    }
}
