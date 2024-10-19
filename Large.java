import java.util.Scanner;
public class Large {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ram age");
        int ram=sc.nextInt();

        System.out.println("Enter shyam age");
        int shyam=sc.nextInt();

        System.out.println("Enter ajay age");
        int ajay=sc.nextInt();

        if(ram>shyam)
        {
            if(ram>ajay)
            {
                System.out.println("Ram is Youngest ");
            }
            else
            {
                System.out.println("Ajay Is Yongest ");
            }
        }
        else{
            if(shyam>ajay)
            {
                System.out.println("Shyam is Yongest ");
            }
            else{
                System.out.println("Ajay is Yongest ");
            }
        }
    }
}
