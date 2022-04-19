import java.util.Scanner;
class hybridinherit
{
    public static void main(String args[]) 
    {
        sub calc1=new sub();
        add calc2=new add();
        supadd calc3=new supadd();
        calc1.getdata();
        int x=calc1.subdata();
        calc2.getdata();
        int y=calc2.adddata();
        calc3.getdata();
        int z=calc3.adddata();
        calc1.putdata();
        calc2.putdata();
        System.out.println("sub: "+x);
        System.out.println("sum" +y);
        System.out.println("supsum"+z);
    }
}
class calculator
{
    int a,b,d;
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
class supadd extends add
{
    public int adddata()
    {
        System.out.println("Enter the third int: ");
        int f=scan.nextInt();
        d=a+b+f;
        return d;
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
