package DAY_04;

public class reverseTheNumber {
    public static void main(String args[]){
        int n = 2456;
        int ans = 0;
        while(n>0){
            int r = n%10;
            ans = (ans * 10) + r;
            n /=10;

        }
        System.out.println(ans);
    }
}
