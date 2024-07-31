import java.util.*;
public class TransportMatrix{
    static void printArray(int[][] arr,int r,int c){
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
    static void TransportMatrix(int[][] arr,int r,int c){
        int[][] ans = new int[c][r];
        for(int i = 0;i<c;i++){
            for(int j = 0;j<r;j++){
                ans[i][j] = arr[j][i];
            }
        }
        printArray(ans, c, r);
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter row of matrix: ");
        int r = in.nextInt();
        System.out.println("Enter column of matrix: ");
        int c = in.nextInt();
        int[][] arr= new int[r][c];
        System.out.println("Enter the matrix : ");
        for(int i = 0;i<r;i++){
            for(int j = 0;j<c;j++){
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println("Original Matrix");
        printArray(arr,r,c);

        TransportMatrix(arr,r,c);
        in.close();
    }
}




