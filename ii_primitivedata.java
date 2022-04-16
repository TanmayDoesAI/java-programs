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
        System.out.println("assigned values: ");
        System.out.println("byte: " + byteVariable1);
        System.out.println("short: " +shortVariable1 );
        System.out.println("int: "+intVariable1);
        System.out.println("long: "+longVariable1);
        System.out.println("float: "+floatVariable1);
        System.out.println("double: "+doubleVariable1);
        System.out.println("boolean: "+booleanVariable1);
        System.out.println("char: "+charVariable1);

        System.out.println("default values: ");
        System.out.println("byte: " + byteVariable2);
        System.out.println("short: " +shortVariable2);
        System.out.println("int: "+intVariable2);
        System.out.println("long: "+longVariable2);
        System.out.println("float: "+floatVariable2);
        System.out.println("double: "+doubleVariable2);
        System.out.println("boolean: "+booleanVariable2);
        System.out.println("char: "+charVariable2);
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