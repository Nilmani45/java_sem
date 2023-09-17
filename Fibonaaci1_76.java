import java.util.Scanner;
public class Fibonaaci1_76 {
    public static void main(String arg[])
    {
    
    // 1. For printing Arithmetic progression

    System.out.println("Enter A,D,N:");
    Scanner sc=new Scanner (System.in);
    int a=sc.nextInt();
    int d=sc.nextInt();
    int n=sc.nextInt();

    
    for(int i=0;i<=n;i++)
    {
    
        System.out.print("The Arithmetic series is:"+a+",");
        a=a+d;

    }

    






    }
}
