class CompoundAssignmentOperator
{
    public static void main(String [] args)
    {
       /*  int a = 1000;
        a = a * 10;
        System.out.println(a);*/
        int a = 1000;
         a *= 10;
        System.out.println("multiplication = "+ a);

        int b = 1000;
         b /= 10;
        System.out.println("Division = "+b);

        int c = 1000;
         c %= 10;
        System.out.println("Modulus = "+c);

        int d = 1000;
         d -= 10;
        System.out.println("Substraction = "+d);

        int e = 1000;
         e += 10;
        System.out.println("Addition = "+e);
    }
}