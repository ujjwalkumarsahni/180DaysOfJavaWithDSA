package DAY_05;

public class RactangularBorderPattern {
    public static void main(String args[]){
        int a = 5;
        int b = 5;
        for(int i = 1;i<=a;i++){
            for(int j = 1;j<=b;j++){
                if(i == 1 || i == a || j == 1 || j ==b){
                    System.out.print('*');
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
