package DAY_04;

public class factorial {
    public static void main(String args[]){
        int n = 5;
        int fact = 1;
        for(int i = 1;i<=n;i++){
            if(n==0){
                fact = 1;
                return; 
            }
            fact*=i;
        }
        System.err.println(fact);
    }
}
