import java.util.Scanner;
class scann1
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The first Number");

        int a=sc.nextInt();

        System.out.println("Enter The Second Number");

        int b=sc.nextInt();

        int c = a + b;
        System.out.println("sum of a and b is :"+ a +"+"+b +"="+c);

    }
}