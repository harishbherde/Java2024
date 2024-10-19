import java.util.Scanner;

public class Threedigitnum {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The number checked Three digit or not :");
        int num = sc.nextInt();

        if (num > 9 && num < 100) {

            System.out.println("It is Two digit number :");
            
        }
        else{
            System.out.println("it is not Two digit number :");
        }
    }
    
}
