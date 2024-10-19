import java.util.Scanner;

public class notdivisible {
    public static void mian(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = sc.nextInt();

        if(num%5==0 || num%3==0)
        {
            System.out.println("The number is divisible 5  and 3");
        }
        else{
            System.out.println("it is not divisible 3 and 5");
        }
    }
}
