import java.util.Scanner;
class Ifstatement
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter the himoglobin level");

        double level = sc.nextDouble();

        if(level>=13)
        {
            System.out.println("please donate blood");
        }
        else{
            System.out.println("You not eligible for blood donate camp");
        }

        System.out.println("Thank you");
    }
}