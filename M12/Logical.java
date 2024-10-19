import java.util.Scanner;
class Logical
{
    public static void main(String [] args)
    {
        Scanner num = new Scanner(System.in);

        System.out.println("Enetr the First Number: ");
        int a = num.nextInt();

        System.out.println("Enetr the Second Number:");
        int b = num.nextInt();

        System.out.println("Enter thne Third Number:");
        int c = num.nextInt();

        int res = (a>b)?((a>c)?a:c):((b>c)?b:c);

        System.out.println("Largest number is : "+res);

    }
}