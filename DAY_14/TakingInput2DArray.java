import java.util.*;
public class TakingInput2DArray {

    static void printArray(int[][] arr){
        for(int i = 0;i<3;i++){
            for(int j = 0;j<3;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hte number of rows : ");
        int r = sc.nextInt();
        System.out.print("Enter hte number of columns : ");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        for(int i = 0; i<r; i++){
            for(int j = 0; j<c;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        printArray(arr);
        sc.close();
    }
}
