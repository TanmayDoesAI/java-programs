// wap to demonstrate the shift operators in python
public class v_shiftoperator {
    public static void main(String args[]) {
        int number = 2;
        //left shift operator
      int ans = number << 2; 
      System.out.println(ans);
       //right shift
      ans = number >> 2;
      System.out.println(ans); 
      int number1 = 2;
      int number2 = -2;
      System.out.println(number1 >>> 2);    
      System.out.println(number2 >>> 2);
  }
}
// 8
// 0
// 0
// 1073741823
