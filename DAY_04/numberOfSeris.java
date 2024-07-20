package DAY_04;

public class numberOfSeris {
    public static void main(String args[]){
        int num = 5;
        int ans = 0;
        for(int i = 1;i<=num;i++){
            if(i%2==0){
                ans-=i;
            }
            else{
                ans +=i;
            }
        }
        System.out.println(ans);
    }
}
