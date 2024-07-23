import java.util.Scanner;

public class ArrayInput {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array of Length : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array element : ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        sc.close();

    }
}
