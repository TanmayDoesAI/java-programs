import java.util.Scanner;
class heirachialinherit
{
    public static void main(String args[]) 
    {
        add calc1=new add();
        sub calc2=new sub();
        calc1.getdata();
        calc2.getdata();
        int x=calc1.adddata();
        int y=calc2.subdata();
        calc1.putdata();
        calc2.putdata();
        System.out.println((x)+(y));
    }
}
class calculator
{
    int a,b;
    Scanner scan=new Scanner(System.in);
    public void getdata()
    {   
        System.out.println("Enter 2 numbers: ");
        a=scan.nextInt();
        b=scan.nextInt();
    }
}
class add extends calculator
{
    int c;
    public int adddata()
    {
        c=a+b;
        return c;
    }
    public void putdata()
    {
        System.out.println("Sum: "+c);
    }
}
class sub extends calculator
{
    int c;
    public int subdata()
    {
        c=a-b;
        return c;
    }
    public void putdata()
    {
        System.out.println("Sub: "+c);
    }
}
