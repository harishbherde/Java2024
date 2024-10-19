import java.util.Scanner;
class Ifstatement5
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Percentage");
        double percent = sc.nextDouble();

        if(percent >= 0 && percent <= 100 )
        {
            if(percent == 35)
            {
                System.out.println("You Just Pass ");
            }
            else if(percent > 35 && percent <= 60)
            {
                System.out.println("Second class");
            }
            else if(percent > 60 && percent <= 75)
            {
                System.out.println("First class ");
            }
            else if(percent > 75 && percent <= 100)
            {
                System.out.println("Excellent....");
            }
            else{
                System.out.println("You are failed...");
            }
        }
        else{
            System.out.println("Invalid Input");
        }

    }
}