package DAY_21;

public class SriesSum {
    static int SriesSumS(int n){
        if(n==0) return 0;
        if(n%2==0){
            return SriesSumS(n-1) -n;
        }
        else{
            return SriesSumS(n-1) + n;
        }
    }
    public static void main(String args[]){
        System.out.println(SriesSumS(5));
    }
}
