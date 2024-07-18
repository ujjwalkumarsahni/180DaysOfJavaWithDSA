import java.util.Scanner;

public class addTwoNumver {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number : ");
        int a = sc.nextInt();

        System.out.print("Enter your Second number : ");
        int b = sc.nextInt();
        
        int sum = a+b;
        System.out.print("Sum is : " + sum);
        
        sc.close();

    }
}
