// wap to demonstrate nested if else
import java.util.Scanner;
public class x_nestedifelse {
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a=scan.nextInt();
        System.out.print("Enter the second number: ");
        int b=scan.nextInt();
        System.out.print("Enter the third number: ");
        int c=scan.nextInt();
        if (b>a)
        {
           if (b>c)
            {
                System.out.println(b+" is greatest.");
            }
            else if (c>b)
            {
                System.out.println(c+" is greatest.");
            }
        }
        else if (a>b)
        {
          if (a>c)
            {
                System.out.println(a+" is greatest.");
            }
           else if (c>a)
            {
                 System.out.println(c+" is greatest.");
            }
        }
        else
        { 
            System.out.println(c+" is greatest.");
        }
        scan.close();
        }
    }

// Enter the first number: 1
// Enter the second number: 2
// Enter the third number: 3
// 3 is greatest.
