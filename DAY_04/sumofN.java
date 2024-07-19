package DAY_04;

import java.io.PrintStream;

public class sumofN {
    public static void main(String args[]){
        int num = 10;
        int sum = 0;
        for(int i = 1;i<=num;i++){
            sum = sum+i;
        }
        PrintStream out = System.out;
        out.println(sum);
    }
}
