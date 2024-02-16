import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int c=sc.nextInt();
        int max=Arrays.stream(arr).max().getAsInt();
        for(int i=0;i<n;i++)
        {
            arr[i]+=c;
        if(arr[i]>=max)
        {
            System.out.print("True ");
        }
        else
        {
            System.out.print("False ");
        }
    }
    }
}