import java.util.Scanner;
public class fibonacci2_76 {
public static void main(String arg[])
{
//2.For printing Geometric progression series
System.out.println("Enter A,D,N:");
Scanner sc=new Scanner (System.in);
int a=sc.nextInt();
int r=sc.nextInt();
int n=sc.nextInt();

for(int i=0;i<n;i++)
{
System.out.print(a+",");
a=a*r;

}

}

}
