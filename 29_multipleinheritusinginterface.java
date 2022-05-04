interface print1
{
    void printdata1();
}
interface print2
{
    void printdata2();
}
class test implements print1,print2
{
    public void printdata1()
    {
        System.out.println("interface print1");
    }
    public void printdata2()
    {
        System.out.println("interface print2");
    }
}
public class interface1 {
    public static void main(String args[])
    {
        test obj=new test();
        obj.printdata1();
        obj.printdata2();
    } 
}
