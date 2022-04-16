// wap to demonstrate arithmatic operators in java
import java.util.Scanner;
public class iv_arithmatic   
{
  public static void main(String[] args)   
  {
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter the first integer: ");	
  	int a=scan.nextInt();
	System.out.print("Enter the second integer: ");	
  	int b=scan.nextInt();
  	System.out.println("a+b value is: "+ (a+b));
  	System.out.println("a-b value is: "+ (a-b));
  	System.out.println("a*b value is: "+ a*b);
  	System.out.println("a/b value is: "+ a/b);
  	System.out.println("a%b value is: "+ a%b);
    scan.close();
  }
}

// Enter the first integer: 5
// Enter the second integer: 10
// a+b value is: 15
// a-b value is: -5
// a*b value is: 50
// a/b value is: 0
// a%b value is: 5