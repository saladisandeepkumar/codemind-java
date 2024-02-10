import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        if(x==4 || x==5 || x==6)
        {
            System.out.println("Summer");
        }
        else if(x==7 || x==8 || x==9 || x==10)
        {
            System.out.println("Rainy");
        }
        else if(x==11 || x==12 || x==1)
        {
            System.out.println("Winter");
        }
        else if(x==2 || x==3)
        {
            System.out.println("Spring");
        }
        else
        {
            System.out.println("-1");
        }
    }
}