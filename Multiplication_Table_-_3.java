import java.util.*;
public class std
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=a;i<=b;i++)
        {
            int res=n*i;
            System.out.println(n+" "+"x"+" "+i+" "+"="+" "+res);
        }
    }
}