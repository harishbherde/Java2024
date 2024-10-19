import java.util.Scanner;
public class YongestThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Ram age");
        int ram=sc.nextInt();

        System.out.println("Enter shyam age ");
        int shyam=sc.nextInt();

        System.out.println("Enter ajay age ");
        int ajay=sc.nextInt();

        if(ram>shyam && ram>ajay)
        {
            System.out.println("ram is Yongest ");
        }
        else if(shyam>ram && shyam>ajay)
        {
            System.out.println("shyam is Yongest ");
        }
        else{
            System.out.println("ajay is Yongest");
        }
    }
    
}
