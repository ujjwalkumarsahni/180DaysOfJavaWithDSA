package DAY_07;

class AlgebraAll{
    int a;
    int b;
    AlgebraAll(int x, int y){
        a = x;
        b = y;
    }
    int add(){
        int ans = a+b;
        return ans;
    }
    int sub(){
        int ans = a-b;
        return ans;
    }
    int mul(){
        int ans = a*b;
        return ans;
    }
}
public class Arithmatic {
    public static void main(String args[]){
        AlgebraAll obj1  = new AlgebraAll(10,10);
        int ans = obj1.add();
        System.out.println(ans);

        int ans2 = obj1.sub();
        System.out.println(ans2);

        int ans3 = obj1.mul();
        System.out.println(ans3);
    }
}
