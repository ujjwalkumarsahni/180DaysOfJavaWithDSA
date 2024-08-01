
import java.util.Scanner;

public class GenerateSpiral {
    static void printArray(int[][] arr ) {
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    static int[][] generateSpiral(int n) {
        int[][] arr = new int[n][n];
        int TopRow = 0, ButtomRow = n - 1, LeftCol = 0, Rightcol = n - 1;
        int curr = 1;
        while (curr <= n * n) {
            for (int j = LeftCol; j <= Rightcol && curr <= n * n; j++) {
                arr[TopRow][j] = curr++;
            }
            TopRow++;

            for (int i = TopRow; i <= ButtomRow && curr <= n * n; i++) {
                arr[i][Rightcol] = curr++;
            }
            Rightcol--;
            for (int j = Rightcol; j >= LeftCol && curr <= n * n; j--) {
                arr[ButtomRow][j] = curr++;
            }
            ButtomRow--;

            for (int i = ButtomRow; i >= TopRow && curr <= n * n; i--) {
                arr[i][LeftCol] = curr++;
            }
            LeftCol++;
        }
        return arr;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter N: ");
        int n = in.nextInt();
         
        int[][] ans = generateSpiral(n);
        printArray(ans);
    }
}

