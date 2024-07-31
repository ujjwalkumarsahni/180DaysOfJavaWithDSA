
import java.util.*;

public class TransportInPlace {

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

        System.out.println("Tranpose matrix");
        transportInPlace(arr, r, c);
        printArray(arr, r, c);
        in.close();
    }
}
