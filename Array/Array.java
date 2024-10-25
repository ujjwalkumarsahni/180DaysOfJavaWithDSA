import java.util.*;
public class Array {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = {1,2,3,4,5};
        int[] arr2 = new int[n];

        for(int i = 0;i<n;i++){
            arr2[i] = in.nextInt();
        }

        for(int val:arr2){
            System.out.print(val+" ");
        }

        in.close();
    }
}

