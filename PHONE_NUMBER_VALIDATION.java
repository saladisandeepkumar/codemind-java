import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String ph=sc.nextLine();
        if(ph.length()==10 && ph.charAt(0)!='0')
        {
            System.out.println("Valid");
        }
        else
        {
            System.out.println("Invalid");
        }
        
    }
}