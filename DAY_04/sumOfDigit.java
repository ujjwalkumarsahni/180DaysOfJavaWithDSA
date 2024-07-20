package DAY_04;

public class sumOfDigit {
    public static void main(String args[]){
        int n = 123;
        int ans = 0;
        while(n>0){
            int r = n%10;
            ans += r;
            n/=10;
        }
        System.out.println(ans);
    }
}


