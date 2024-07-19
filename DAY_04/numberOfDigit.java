package DAY_04;

public class numberOfDigit {
    public static void main(String args[]){
        int num = 1234567;
        int count = 0;
        while(num>0){
            num /=10;
            count++;
        }

        System.out.println(count);

    }
}
