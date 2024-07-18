import  java.util.*;
public class evenodd {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        if(num%2==0){
            System.out.println("Even number");
        }
        else{
            System.out.println("odd number");
        }
        sc.close();
    }
}
