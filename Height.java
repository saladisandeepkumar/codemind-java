import java.io.*;
import java.util.Scanner;
public class sample{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int maxi=Math.max(n,m);
        if(maxi<=n)
        {
            System.out.println(n);
        }
        if(maxi<=m)
        {
            System.out.println(m);
        }
    }
}