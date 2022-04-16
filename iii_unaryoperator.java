// wap to demonstrate unary operator in java
import java.util.Scanner;
public class iii_unaryoperator   
{
  public static void main(String[] args)   
  {
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter the integer: ");	
  int x=scan.nextInt();
  System.out.println("X++ value is:"+ x++);
  System.out.println("++X value is:"+ ++x);
  System.out.println("X-- value is:"+ x--);
  System.out.println("--X value is:"+ --x);
  scan.close();
  }
}  
// Enter the integer: 10
// X++ value is:10
// ++X value is:12
// X-- value is:12
// --X value is:10