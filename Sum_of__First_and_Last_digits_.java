import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        n=Math.abs(n);
        String num=Integer.toString(n);
        int first=Character.getNumericValue(num.charAt(0));
        int last=Character.getNumericValue(num.charAt(num.length()-1));
        int sum=first+last;
        System.out.println(sum);
        
    }
}