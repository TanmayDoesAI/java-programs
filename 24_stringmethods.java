import java.lang.String;
 class stringmethod {
    public static void main(String args[] ) 
    {
        String test= "abcd";
        System.out.println(test.length()+"\n"+test.charAt(0)+"\n"+test.concat("zyx")+"\n"+test.contains("ab")+"\n"+test.startsWith("ab")
                           +"\n"+test.endsWith("yz")+"\n"+test.indexOf("i")+"\n"+test.isEmpty()+"\n"+test.replace("abc","def")+"\n"
                           +test.substring(1,3)+"\n"+test.toLowerCase()+"\n"+test.toUpperCase()+"\n"+test.trim());
    }
}

// 4
// a
// abcdzyx
// true
// true
// false
// -1
// false
// defd
// bc
// abcd
// ABCD
// abcd
