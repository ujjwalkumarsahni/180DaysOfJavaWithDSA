package DAY_04;

public class pawarOfNumber {
    public static void main(String args[]){
        int number = 5;
        int base = 2;
        int ans = 1;
        for(int i = 1;i<=base;i++){
            ans = ans * number;
        }
        System.out.println(ans);
    }
}
