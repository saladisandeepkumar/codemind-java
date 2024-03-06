import java.util.*;
public class main{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int f=0;
    int f1=1;
    int t;
    System.out.print(f+" ");
    System.out.print(f1+" ");
    for(int i=2;i<n;i++)
    {
        t=f+f1;
        f=f1;
        f1=t;
        System.out.print(t+" ");
        
    }
}
}