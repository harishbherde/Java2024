import java.util.Scanner;

public class Rectangle {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length");
        int length=sc.nextInt();

        System.out.println("Enter the Breadth");
        int breadth=sc.nextInt();

        int area=length*breadth;
        int perimeter = 2*(length+breadth);
        if(area>perimeter)
        {
            System.out.println("area is greater than perimeter");
        }
        if(perimeter>area)
        {
            System.out.println("perimeter is greater than area");
        }
        if(perimeter==area)
        {
            System.out.println("area and perimeter are equal");
        }

    }
}
