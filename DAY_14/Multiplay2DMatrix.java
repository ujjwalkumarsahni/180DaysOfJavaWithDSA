import java.util.Scanner;

public class Multiplay2DMatrix {
    static void printArray(int[][] arr, int r1,int c1) {
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void mul(int[][] arr,int r1,int c1,int[][] arr2,int r2,int c2){
        if(c1 != r2){
            System.out.println("worng input multiplication not possible");
            return;
        }
        int[][] mul = new int[r1][c2];
        for(int i =0;i<r1;i++){
            for(int j =0;j<c2;j++){
                for(int k = 0;k<c1;k++){
                    mul[i][j] += (arr[i][k] * arr2[k][j]);
                }
            }
        }
        System.out.println("multiplication of two matrics :");
        printArray(mul, r1, c2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hte number of rows : ");
        int r1 = sc.nextInt();
        System.out.print("Enter hte number of columns : ");
        int c1 = sc.nextInt();
        int[][] arr = new int[r1][c1];
        System.out.println("Enter matrix : ");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter hte number of rows : ");
        int r2 = sc.nextInt();
        System.out.print("Enter hte number of columns : ");
        int c2 = sc.nextInt();
        int[][] arr2 = new int[r2][c2];
        System.out.println("Enter matrix : ");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix 1 : ");
        printArray(arr,r1,c1);
        System.out.println("Matrix 2 : ");
        printArray(arr2,r2,c2);
        
        mul(arr, r1, c1, arr2, r2, c2);
        sc.close();
    }
}
