import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean flag=false;
        for(int i=0;i<=Math.sqrt(n);i++)
        {
            if(i*(i + 1)==n)
            {
                flag=true;
                break;
            }
        }
        if(flag)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
        
    }
}