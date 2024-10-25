public class CountDigit {
    public static void main(String[] args) {
        int n = 12345;
        int ans = 0;
        while(n>0){
            int r = n%10;
            ans++;
            n = n/10;
        }
        System.out.print(ans);
    }
}
