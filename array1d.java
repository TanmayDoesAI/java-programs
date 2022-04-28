import java.util.Scanner;
class array1d
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the length of the array you want to create: ");
        int x=scan.nextInt();
        int arr[]=new int[x];
        System.out.print("Enter the elements one by one: ");
        for (int i=0;i<x;i++)
        {
            arr[i]=scan.nextInt();
        }
        System.out.println("The array is: ");
        for (int i=0;i<x;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}


// Enter the length of the array you want to create: 3
// Enter the elements one by one: 1
// 2
// 3
// The array is: 
// 1 2 3
