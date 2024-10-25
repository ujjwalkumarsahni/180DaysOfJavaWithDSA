import  java.util.Scanner;

public class PrintDay {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter 1 to 7 Digit");
        int op = sc.nextInt();

        switch(op){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednestday");
                break;
            case 4:
                System.out.println("Trusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Satarday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("please Enter valid input");
            
        }
    }
}
