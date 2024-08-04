public class FactorialUsingRecursion{

    static int Factorial(int n){
        // base case
        if(n==00){
            return 1;
        }
        // Recursive work
        int smallAns = Factorial(n-1);

        // self work
        int ans = n * smallAns;
        return ans;
    }
    
    public static void main(String args[]){
        int n = 5;
        int ans = Factorial(n);
        System.out.println(ans);
    }
}
