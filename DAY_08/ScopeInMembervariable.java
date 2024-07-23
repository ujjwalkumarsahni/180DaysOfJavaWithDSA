class Algebra{
    int a = 10;
    int b = 3; // class level scope 
    int Add(){
        return a+b;
    }
}
public class ScopeInMembervariable{
    public static void main(String args[]){
        Algebra obj1 = new Algebra();
        System.out.println(obj1.Add());
    }
}