public class statickeyword {
    public static void main(String args[])
    {
        test tes1=new test();
        test tes2=new test();
        test tes3=new test();
        test.printcount();
    }
}
class test
{
    static int count=0;
    public test()
    {
        count++;
    }
    static public void printcount()
    {   
        System.out.println(count);
    }
}

//3
