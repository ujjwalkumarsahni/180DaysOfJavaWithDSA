package DAY_07;
class Algebra{
    int Add(int a , int b){
        int ans = a + b;
        return ans;
    }
}
public class addTwoNuMethod {
    public static void main(String args[]){
        Algebra obj1 = new Algebra();
        int ans = obj1.Add(10, 30);

        System.out.println(ans);
    }
}
