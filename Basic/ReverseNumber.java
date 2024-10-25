public class ReverseNumber {
    public static void main(String args[]){
        int n = 12345;
        int ans = 0;
        while(n>0){
            int lastdigist = n%10;
            ans = (ans * 10) + lastdigist;

            n /=10;
        }
        System.out.println(ans);
    }
}
