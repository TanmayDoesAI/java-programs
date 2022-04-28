//wap to demonstrate switch case
import java.util.Scanner;
public class switchcase {
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a= scan.nextInt(),b= scan.nextInt();
        System.out.print("Choose the operation to perform, 1 for addition, 2 for subtraction, 3 for multiplication, 4 for division: ");
        int c= scan.nextInt();
        int d;
        switch(c){
            case 1:
                d=a+b;
                break;
            case 2:
                d=a-b;
                break;
            case 3:
                d=a*b;
                break;
            case 4:
                d=a/b;
                break;
            default:
                System.out.println("Invalid input try again!");
        }
        System.out.println("The output is "+d);
        scan.close();
    }
}

// Enter two numbers: 12
// 14
// Choose the operation to perform, 1 for addition, 2 for subtraction, 3 for multiplication, 4 for division: 1
// The output is 26
