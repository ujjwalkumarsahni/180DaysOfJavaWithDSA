public class CheckPalindrom {
    static boolean isPalindrom(int n){
        int temp = n;
        int rev = 0;

        if(temp<0){
            return false;
        }
        while(temp>0){
            int ls = temp%10;
            rev = (rev * 10) + ls;
            temp /=10;
        }
        if(rev == n){
            return  true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        int n = 121;
        boolean ans = isPalindrom(n);
        System.out.println(ans);
    }
}
