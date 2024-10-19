class Narrowing
{
    public static void main(String [] args)
    {
        int a = 123;
        char ch=(char)123;
        System.out.println(ch);     //{

        byte b = 121;
        double c = (double)121;
        System.out.println(c);      //121.0
        
        double d = 1000.0;
        int i = (int)1000.0;
        System.out.println(i);      //1000

        float f = 199.90F;
        byte n = (byte)199.90;
        System.out.println(n);      //-57 loss some data

        long l = 122111;
        int p =(int)122111;
        System.out.println(p);

        


    }
}