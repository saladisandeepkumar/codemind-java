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
            int m=(int)Math.sqrt(x);
            int s=m*m;
            if(x==s)
            {
                System.out.println("True");
            }
            else
            {
                System.out.println("False");
            }
        }
    }
}
