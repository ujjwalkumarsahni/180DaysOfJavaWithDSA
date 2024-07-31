import java.util.Scanner;

public class Rotate90DegressClockwise {
    
    static void printArray(int[][] arr, int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    static void transportInPlace(int[][] arr, int r, int c) {
        for (int i = 0; i < c; i++) {
            for (int j = i; j < r; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        
    }
    static void reverseArray(int[] arr){
        int i =0;
        int j = arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    } 
    static void rotate(int[][] arr,int n){
        transportInPlace(arr,n,n);
        for(int i =0;i<n;i++){
            reverseArray(arr[i]);
        }
        printArray(arr, n, n);  
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter row of matrix: ");
        int r = in.nextInt();
        System.out.println("Enter column of matrix: ");
        int c = in.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("Enter the matrix : ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println("Original Matrix");
        printArray(arr, r, c);

        System.out.println("Roteted of 90 degrees matrix");
        rotate(arr, r);
        in.close();
    }
}
