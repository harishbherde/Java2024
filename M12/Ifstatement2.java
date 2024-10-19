import java.util.Scanner;
class Ifstatement2
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");

        int num = sc.nextInt();

        if(num%2==0)
        {
            System.out.println("It is An Even number "+ num);
        }
        else
        {
            System.out.println("It is an odd number "+num);
        }
    }
}