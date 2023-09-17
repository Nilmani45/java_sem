public class Bitmaskingmerging {
    public static void main(String arg[])
    {
        // Swapping by using the XOR operation

        //  int a=10;
        //  int b=20;
        //  a=a^b;
        //  b=a^b;
        //  a=a^b;
        //  System.out.println(a+" "+b );

         byte a=7,b=14;
         byte c;
         c=(byte) (a<<4);
         c=(byte)(c|b);
         System.out.println((c&0b11110000)>>4);
         System.out.println(c&0b00001111);



        



    }
    
}
