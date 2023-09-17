//Nested else if ladder condition:

public class Conditional2 {
    public static void main(String arg[])
    {
    int a=5,b=15,c=4;
    if(a>b && a>c){
        System.out.println("A value is greater:"+a);
    }
    else if(b>a && b>c)
    {
        System.out.println("B value is greater:"+b);
    }

    else
    {
        System.out.println("C value is greater:"+c);
    }

    }
}
