import java.util.Scanner;
public class pattern {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        int r = obj.nextInt();
        int c = obj.nextInt();
        for (int i = 1; i <= r; i++) 
        {
            for (int j = 1; j <= c; j++) 
            {
                if (i == 1 || i == r || j == 1 || j == c)
                {
                    System.out.print("*");
                } 
              else 
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
      obj.close();
    }
}
