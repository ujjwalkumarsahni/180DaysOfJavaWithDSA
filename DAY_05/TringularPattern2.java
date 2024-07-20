package DAY_05;

public class TringularPattern2 {
    public static void main(String[] args) {
        int n =10;
        for (int i = 1; i <= n; i++) {
            for(int j = 1;j<=(n+1-i);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
