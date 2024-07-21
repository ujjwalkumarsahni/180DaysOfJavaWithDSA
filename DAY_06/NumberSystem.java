public class NumberSystem{
    public static void main(String args[]){
        int binaryNum = 1101;
        int ans = 0;
        int p = 1;
        while(binaryNum > 0 ){
            int unit_digit = binaryNum % 10;
            ans +=(unit_digit*p);
            binaryNum /=10;
            p *= 2;
        }
        System.out.println(ans);

    }
}