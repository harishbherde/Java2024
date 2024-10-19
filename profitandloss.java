import java.util.Scanner;
public class profitandloss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Cost Price");
        int cp=sc.nextInt();
        System.out.println("Enter Sellling price");
        int sp=sc.nextInt();

        if(sp>cp)
        {
            System.out.print("You made a Profit :");
            System.out.print(sp-cp);
        }
        else{
            System.out.print("You gain loss :");
            System.out.println(cp-sp);
        }
    }
    
}
