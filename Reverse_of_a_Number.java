import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int digit;
        int sum=0;
        while(n!=0)
        {
            digit=n%10;
            sum=sum*10+digit;
            n=n/10;
            
        }
        System.out.println(sum);
    }
}