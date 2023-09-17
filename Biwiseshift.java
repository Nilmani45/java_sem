public class Biwiseshift{

    public static void main(String arg[])
    {
        // int a=0b1010;
        // int b=0b0110;
        // int z,r,p,q;
        // z=a&b;
        // r=a|b;
        // p=a^b;
       
        // System.out.println(z);
        // System.out.println(r);
        // System.out.println(p);
       
        // Left shift :

        // int x =0b0100;
        // int y;
        // y=x<<1;
        // System.out.println(y);//Give the output by multiplying it by 2
        
        // Right shift:
        // int x=0b1000;
        // int y;
        // y=x>>1;

        // System.out.println(y);

        // Right shift with sign bit
    //     int x=-0b1010;
    //     int y;
    //     y=x>>>1;

    // System.out.println(y);//It will give the positive value

    int x=-0b1010;
    int y;
    y=x>>>1;
    System.out.println(String.format("%s",Integer.toBinaryString(x)));
    System.out.println( String.format("%s",Integer.toBinaryString(y)));








    }
}