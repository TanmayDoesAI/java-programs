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
class singleinherit
{
    public static void main(String args[]) 
    {
        sub s1=new sub();
        int a=s1.subb(1,2);
        int b=s1.addd(1,2);
        System.out.println("sum: "+a+"\nsub: "+b);
    }
}
