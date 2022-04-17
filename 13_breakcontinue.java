//wap to demonstrate break and continue 
public class breakcontinue {
    public static void main(String args[]){
        for (int i=0;i<20;i++)
        {
            if(i==5)
            {
                continue;
            }
            if (i==11)
            {
                break;
            }
            System.out.println(i);
        }
    }
}
// 0
// 1
// 2
// 3
// 4
// 6
// 7
// 8
// 9
// 10
