import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String id=sc.nextLine();
        String name=sc.nextLine();
        int n=sc.nextInt();
        double charge=0;
        if(n<=199)
        {
            charge=n*1.20;

        }
        else if(n>200 && n<400)
        {
            charge=n*1.50;
        }
        else if(n>400 && n<600)
        {
            charge=n*1.80;
        }
        else if(n>600)
        {
            charge=n*2.00;
        }
        if(charge > 400)
        {
            charge+=charge*0.15;
        }
        else
        {
            charge=charge+100;
        }
        
        System.out.format("%.2f",charge);
        
        
        
    }
}