class expression
{
    public static void main(String [] args)
    {
        int a = 2;
        int b = 4;
        int c = 6;

        a+= ++a - b*3 + --c + a++;
        System.out.println(a);

    }
}