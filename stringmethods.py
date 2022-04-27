import java.lang.String;
 class stringmethods {
    public static void main(String args[] ) 
    {
        String test= "  abcvbslbfasdn";
        System.out.println(test.length());
        System.out.println(test.IndexOf("a"));
        System.out.println(test.isBlank());
        System.out.println(test.isEmpty());
        System.out.println(test.substring(4));
        System.out.println(test.substring(10,11));
        System.out.println(test.substring(-2,-1));
        char[] chararray=test.toCharArray();
        for(int i=0;i<chararray.length;i++)
        {
                System.out.println("index: "+i+": "+chararray[i]);
        }
    }
}
