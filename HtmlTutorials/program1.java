class program1{
    public static void main(String[] args)
    {
       //float to int 
       float f=1.2f;
       int i = (int)f;
       System.out.println(i);

       float f=1.2f;
       long l = (long)f;
       System.out.println(l);

       float f=1.2f;
       byte b = (byte)f;
       System.out.println(b);

       float f=1.2f;
       short s = (short)f;
       System.out.println(s);

       long l=4045555656455;
       int i = (int)l;
       System.out.println(i);

       long l=4045555655655;
       char c = (char)f;
       System.out.println(c);

       int i = 200;
       byte b = (byte)i;
       System.out.println(b);

       int i=2147483647;
       char c = (char)i;
       System.out.println(c);
    }
}