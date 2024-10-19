import java.util.Scanner;
public class timepass {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Password...");
        int password= sc.nextInt();
        
        if(password==123456)
        {
            System.out.println("Sanskar age := 12");
            System.out.println("Sanskar School := ST School");
            System.out.println("Sanskar Favourate Game := GTA 6");
        }
        else{
            System.out.println("Sorry You Enter Wrong Password...");
        }


    }
    
}
