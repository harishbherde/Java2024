class stat1
{
    static int a = add();
    System.out.println(a);
    public static void main(String [] args)
    {
        static int add(int a,int b)
        {
            int c = a+b;
            return c;
        }
        stat1.add(10,20);
    }
}