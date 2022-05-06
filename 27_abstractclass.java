//wap to demonstrate abstract class and its features
abstract class test
{
    static int count=0;
    public test()
    {
        System.out.println("constructor abstract");
        count++;
    }
    public void show()
    {
        System.out.println("test show");
    }
    public abstract void show1();
    public static void showcount()
    {
        System.out.println("count: "+count);
    }
}
class test1 extends test
{
    public void show1()
    {
        System.out.println("test show1");
    }
    public void show2()
    {
        System.out.println("test1 show2");
    }

}
public class abstractclass 
{
    public static void main(String args[])
    {
        test1 obj=new test1();
        obj.show();
        obj.show1();
        obj.show2();
        test1.showcount();
    } 
}



// constructor abstract
// test show
// test show1
// test1 show2
// count: 1
