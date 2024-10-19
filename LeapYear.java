import java.util.Scanner;

public class LeapYear {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int Year=sc.nextInt();
        if(Year%100==0 && Year%400==0 || Year%100!=0 && Year%4==0)
        {
            System.out.println("It is Leap year :");
        }
        else{
            System.out.println("It is not Leap Year :");
        }
    }
    
}
