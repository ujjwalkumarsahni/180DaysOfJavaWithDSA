public class Fibonacci{
    static int fib(int n){
        // base case
        if(n==0 || n==1){
            return n;
        }
        // recursive work
        int prev = fib(n-1);
        int prevPrev = fib(n-2);

        // self work
        return prev + prevPrev;
    }
    public static void main(String args[]){
        System.out.println(fib(6));
    }
}
