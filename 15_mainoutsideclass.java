class test
{
    int id;
    String str;
}
public class mainoutsideclass {
    public static void main(String args[])
    {
        test t1=new test();
        t1.id=10;
        t1.str="abc";
        System.out.println(t1.id);
        System.out.println(t1.str);
    }
}
// 10
// abc
