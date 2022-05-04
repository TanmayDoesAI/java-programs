interface print
{
    void print1();
}
class test implements print
{
    public void print1()
    {
        System.out.println("interface print1");
    }
}
public class interface1 {
    public static void main(String args[])
    {
        test obj=new test();
        obj.print1();
    } 
}
//interface print1
