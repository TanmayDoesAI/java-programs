import java.util.Scanner;
public class methodoverloading {
    public static int add(int a,int b)
    {
        int c=a+b;
        return c;
    }
    public static int add(int a, int b, int c)
    {
        int d=a+b+c;
        return d;
    }
    public static void main(String args[]) 
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("enter 3 integers: ");
        int a=scan.nextInt(),b=scan.nextInt(),c=scan.nextInt();
        int d=add(a,b);
        int e=add(a,b,c);  
        System.out.println("Sum of first 2 integers: "+d+"\n"+"Sum of three integers: "+e); 
        scan.close();
    }
}
