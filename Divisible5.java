import java.util.Scanner;

public class Divisible5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        int num = sc.nextInt();
        if (num % 5 == 0) {
            System.out.println("Yes Is Divisible Number");
        }
        else{
            System.out.println("Its not Divisible number");
        }
    }

}
