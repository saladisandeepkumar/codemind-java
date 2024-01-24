import java.io.*;
import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int sum=((x*y)/(x+y));
        System.out.println(sum);
}
}