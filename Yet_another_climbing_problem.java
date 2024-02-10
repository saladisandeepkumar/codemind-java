import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int x=sc.nextInt();
            int y=sc.nextInt();
            int sum=x/y;
            int rem=x%y;
            int tot=sum+rem;
            System.out.println(tot);
        }
    }
}