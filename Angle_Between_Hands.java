import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String []input=s.split(":");
        int hr=Integer.parseInt(input [0]);
        int min=Integer.parseInt(input[1]);
        double hrang=hr*30+(min/5.0)*2.5;
        double minang=min*6;
        double abs=Math.abs(hrang-minang);
        System.out.println(Math.min(abs,360-abs));
    }
}