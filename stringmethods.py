import java.lang.String;
 class stringmethods {
    public static void main(String args[] ) 
    {
        String test= "  abcvbslbf";
        System.out.println(test.length());
        System.out.println(test.isBlank());
        System.out.println(test.isEmpty());
        System.out.println(test.substring(4));
        System.out.println(test.substring(3,5));
        char[] chararray=test.toCharArray();
        for(int i=0;i<chararray.length;i++)
        {
                System.out.println("index: "+i+": "+chararray[i]);
        }
    }
}
 
#  11
# false
# false
# cvbslbf
# bc
# index: 0:  
# index: 1:
# index: 2: a
# index: 3: b
# index: 4: c
# index: 5: v
# index: 6: b
# index: 7: s
# index: 8: l
# index: 9: b
# index: 10: f
