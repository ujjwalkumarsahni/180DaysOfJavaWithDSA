package HackerRankProblem;
import java.util.Scanner;
public class JavaIfElse {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if(N % 2 !=0){
            System.out.println("Weird");
        }
        else
        {
            if( N>=2 && N<=5){
                System.out.println("Not Weird");
            }
            else if(N>=6 && N<=20){
                System.out.println("Weird");
            }
             else if(N>20){
            System.out.println("Not Weird");
             }
       }
       sc.close();

    }
}
