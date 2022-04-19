class add
{
    int sum;
    public int addd(int x,int y)
    {
        sum=x+y;
        return sum;
    }
}
class sub extends add
{
    int subt;
    public int subb(int x,int y)
    {
        subt=x-y;
        return subt;
    }
}
class mult extends sub
{   
    int multt;
    public int multi(int x,int y)
    {
        multt=x*y;
        return multt;
    }
}
public class multilevelinherit 
{
    public static void main(String args[]) 
    {
        mult m1=new mult();
        int x=m1.addd(1,2);
        int y=m1.subb(1,2);
        int z=m1.multi(1,2);
        System.out.println(x+" "+y+" "+z);
    }   
}
