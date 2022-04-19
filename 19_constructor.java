public class constructor 
{
    public static void main(String args[])
    {
        a a1=new a();
        a a2=new a(4);
        a1.putdata();
        a2.putdata();
    }
}
class a
{
    public a()
    {
        System.out.println("default cons");
    }
    public a (int a)
    {
        System.out.println("parameterised cons");
    }
    public void putdata()
    {
        System.out.println("putdata()");
    }
}
