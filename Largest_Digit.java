import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=n;
        int rem=0;
        int sum=0;
        while(m>0)
        {
            rem=m%10;
            sum=Math.max(sum,rem);
            m=m/10;
        }
        System.out.println(sum);
    }
}