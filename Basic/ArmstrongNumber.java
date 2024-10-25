public class ArmstrongNumber {
    static boolean isArmstrong(int n){
        int temp = n;
        int ans = 0;
        while(temp>0){
            int ls = temp%10;
            ans +=(ls*ls*ls);
            temp/=10;
        }
        if(n==ans){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        int n = 154;
        boolean ans = isArmstrong(n);
        System.out.println(ans);
    }
}
