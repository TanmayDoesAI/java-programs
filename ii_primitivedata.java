// wap to demonstrate the value and default values of primitive data types
public class ii_primitivedata {
    static byte byteVariable2;
    static short shortVariable2;
    static int intVariable2;
    static long longVariable2;
    static float floatVariable2;
    static double doubleVariable2; 
    static boolean booleanVariable2;
    static char charVariable2;

    public static void main(String args[]){
        byte byteVariable1=1;
        short shortVariable1=1;
        int intVariable1=1;
        long longVariable1=1;
        float floatVariable1=1.0f;
        double doubleVariable1=1.0d; 
        boolean booleanVariable1=true;
        char charVariable1='a';
        System.out.println("assigned values: "+"\n"+"byte: " + byteVariable1+"\n"+"short: " +shortVariable1 +"\n"+"int: "+intVariable1+"\n"+"long: "+longVariable1+"\n"+"float: "+floatVariable1+"\n"+"double: "+doubleVariable1+"\n"+"boolean: "+booleanVariable1+"\n"+"char: "+charVariable1);
        System.out.println("default values: "+"\n"+"byte: " + byteVariable2+"\n"+"short: " +shortVariable2 +"\n"+"int: "+intVariable2+"\n"+"long: "+longVariable2+"\n"+"float: "+floatVariable2+"\n"+"double: "+doubleVariable2+"\n"+"boolean: "+booleanVariable2+"\n"+"char: "+charVariable2);
    }
    
}
// assigned values: 
// byte: 1
// short: 1
// int: 1
// long: 1
// float: 1.0
// double: 1.0
// boolean: true
// char: a
// default values:
// byte: 0
// short: 0
// int: 0
// long: 0
// float: 0.0
// double: 0.0
// boolean: false
// char:
