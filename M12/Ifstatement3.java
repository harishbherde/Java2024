//check the given char is an digit  or not 
import java.util.Scanner;
class Ifstatement3
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Character");
        char c = sc.next().charAt(0);

        if(c>='0' && c<='9')
        {
            System.out.println("It is an digit");
        }
        else{
            System.out.println("it is not digit");
        }
    }
}