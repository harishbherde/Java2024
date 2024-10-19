//write a program to check given character in alphabate,digit or special character
import java.utilScanner;

class Ifstatement4
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter thne character ");

        char ip = sc.next().charAt(0);

        if(ip>='0' && ip<= '9')
        {
            System.out.prinln("It is an Digit");
        }
        else if(ip>='a' && ip<='z' || ip>='A' && ip<='Z')
        {
            System.out.println("It is an Alphabate");
        }
        else
        {
            System.out.println("It is an Special Character ");
        }
    }
}