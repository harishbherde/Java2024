import java.util.Scanner;
public class Printmyname {

    public static void printmyname(String name)
    {
        System.out.println(name);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Printmyname sc = new Printmyname();
       // sc.printmyname();
       String name=sc.next();
       printmyname(name); 
    }
    
}
