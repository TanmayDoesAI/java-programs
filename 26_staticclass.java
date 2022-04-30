public class staticclass 
{
    static String s="test";
    static class nestedclass
    {
        public void show()
        {
            System.out.println(s);
        }
    }
    public static void main(String args[])
    {
        staticclass.nestedclass obj=new staticclass.nestedclass();
        obj.show(); 
    }   
}
