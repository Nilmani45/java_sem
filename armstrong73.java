import java.util.Scanner;

public class armstrong73
{
    public static void main(String arg[])
    {
         System.out.println("Enter the number:");
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        
        int m=n;//At the end the value of N will become 0.so we are storing the  actual N value in other variable to compare it with sum.
        int sum=0;
        while(n>0)
        {
            int r=n%10;
            n=n/10;
            sum=sum+r*r*r;
        
        }

        if(m==sum)
        {
            System.out.println("This is armstrong number");
        }
        else
        {
            System.out.println("Not an armstrong number");
        }
    }
}