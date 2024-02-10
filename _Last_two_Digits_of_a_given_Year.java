import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int sum=x%100;
        if(sum<10)
        {
            System.out.println("0"+sum);
        }
        else
        {
            System.out.println(sum);
        }
    }
}