public class IntroOf2DArray{
    static void printArray(int[][] arr){
        for(int i = 0;i<3;i++){
            for(int j = 0;j<3;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // int[][] arr = new int[2][3];

        int[][] arr2 = {{1,2,3},{4,5,6},{7,8,9}};
        printArray(arr2);
        
    }
}