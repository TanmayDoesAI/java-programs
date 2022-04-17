class test
{
    int id;
    String name;
    void getdata(int a, String s)
    {
        id=a;
        name=s;
    }
}
public class xvii_initialisationbymethodandrefernce {
    public static void main(String args[])
    {
        test t1= new test();
        //initialisation with reference
        t1.id=10;
        t1.name="abc";
        test t2=new test();
        System.out.println("by reference: "+t1.id+" "+t1.name);
        //initialisation with method
        int a=10;
        String b="abc";
        t2.getdata(a,b);
        System.out.println("by method: "+t2.id+" "+t2.name);
    }    
}
// by reference: 10 abc
// by method: 10 abc