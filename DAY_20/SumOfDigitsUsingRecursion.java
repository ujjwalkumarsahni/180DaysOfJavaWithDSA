public class SumOfDigitsUsingRecursion{
    static int SumOfDigits(int n){
        // Base Case
        if(n>=0 && n<=9){
            return n;
        }

        // Recursive work 
        int smallAns = SumOfDigits(n/10);
        int ans = smallAns + n%10;

        return ans;
    }
    
    public static void main(String args[]){
        System.out.println(SumOfDigits(12345));
    }
}
