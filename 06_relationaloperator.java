// wap to demonstrate relational operator in java
import java.util.Scanner;
public class vi_relationaloperator {
    public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
    System.out.print("Enter the first number: ");
    int a=scan.nextInt();
    System.out.print("Enter the second number: ");
    int b=scan.nextInt();
    if (a>b)
    {
        System.out.println(a+ " is greater.");
    }
    else if (b>a)
    {
        System.out.println(b+" is greater.");
    }
    else if(b==a)
    {
        System.out.println(a+" and "+b+" are equal.");
    }
    scan.close();
    }
    
}

// Enter the first number: 5
// Enter the second number: 15
// 15 is greater.




