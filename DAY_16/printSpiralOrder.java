import java.util.Scanner;

public class printSpiralOrder {

    static void PrintSpiralOrder(int[][] arr, int r, int c) {
        int TopRow = 0, ButtomRow = r - 1, LeftCol = 0, Rightcol = c - 1;
        int totalELement = 0;
        while (totalELement<r*c) {
            for (int j = LeftCol; j <= Rightcol && totalELement<r*c; j++) {
                System.out.print(arr[TopRow][j] + " ");
                totalELement++;
            }
            TopRow++;

            for (int i = TopRow; i <= ButtomRow && totalELement<r*c; i++) {
                System.out.print(arr[i][Rightcol] + " ");
                totalELement++;
            }
            Rightcol--;
            for (int j = Rightcol; j >= LeftCol && totalELement<r*c; j--) {
                System.out.print(arr[ButtomRow][j]+ " ");
                totalELement++;
            }
            ButtomRow--;

            for (int i = ButtomRow; i >= TopRow && totalELement<r*c; i--) {
                System.out.print(arr[i][LeftCol]+" ");
                totalELement++;
            }
            LeftCol++;
        }
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter row of matrix: ");
        int r = in.nextInt();
        System.out.println("Enter column of matrix: ");
        int c = in.nextInt();
        int[][] arr= new int[r][c];
        System.out.println("Enter the matrix : "+r*c);
        for(int i = 0;i<r;i++){
            for(int j = 0;j<c;j++){
                arr[i][j] = in.nextInt();
            }
        }
        
        PrintSpiralOrder(arr,r,c);
    }
}
