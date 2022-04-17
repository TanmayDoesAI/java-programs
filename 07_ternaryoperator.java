// wap to demonstrate ternary operator
import java.util.Scanner;
public class vii_ternaryoperator {
    public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
    System.out.print("Enter the first number: ");
    int a=scan.nextInt();
    System.out.print("Enter the second number: ");
    int b=scan.nextInt();
    if (a!=b)
    {
        int c=a>b?a:b;
        System.out.println(c+" is greater.");
    }
    else if (a==b)
    {
        System.out.println(a+" and "+b+" are equal.");
    }
    scan.close();
    }
}

// Enter the first number: 20
// Enter the second number: 23
// 23 is greater.
