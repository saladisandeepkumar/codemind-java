import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        for(int i=0;i<x;i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=sc.nextInt();
            double sum=(double)c/a;
            double sum1=(double)d/b;
            if(sum<sum1)
            {
                System.out.println("-1");
            }
            else if(sum==sum1)
            {
                System.out.println("0");
            }
            else
            {
                System.out.println("1");
            }
        }
    }
}