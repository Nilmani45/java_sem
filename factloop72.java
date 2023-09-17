import java.util.Scanner;
public class factloop72
{
    public static void main(String arg[])
    {
        int fact=1;
        System.out.println("Enter the number:");
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("The factorial is:"+fact);


    }

}

