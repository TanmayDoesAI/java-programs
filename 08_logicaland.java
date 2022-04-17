// wap to compare 3 numbers in java

import java.util.Scanner;
public class viii_logicaland {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int a=scan.nextInt();
        System.out.print("Enter the second integer: ");
        int b=scan.nextInt();
        System.out.print("Enter the third integer: ");
        int c=scan.nextInt();

        if (a>b && a>c)
        {
            System.out.println(a+" is greatest.");
        } 
        else if(b>c && b>a)
        {
            System.out.println(b+" is greatest.");
        }
        else if (c>b && c>a)
        {
            System.out.println(c+" is greatest.");
        }
    }
}

// Enter the first integer: 1
// Enter the second integer: 2
// Enter the third integer: 3
// 3 is greatest.
