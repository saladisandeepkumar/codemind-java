import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=(int)Math.sqrt(n);
        boolean flag=false;
        for(int i=0;i<=m;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(i*i+j*j==n)
                {
                    flag=true;
                    break;
                }
                
            }
        }
        if(flag)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}