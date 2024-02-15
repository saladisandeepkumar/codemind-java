import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int max=(int)Math.sqrt(n);
        int rem=max*max;
        if(rem==n)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}