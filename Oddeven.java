import java.util.Scanner;
public class Oddeven {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the number checked odd or even");
        int num = sc.nextInt();

        if(num % 2 == 0)
        {
            System.out.println("Even number = "+num);

        }
        else{
            System.out.println("Odd Number = "+num);
        }
    }
    
}
