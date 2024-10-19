import java.util.Scanner;

public class Axis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the X axis ");
        int x = sc.nextInt();

        System.out.println("Enter the Y axis ");
        int y = sc.nextInt();

        if (x == 0 && y == 0) {
            System.out.println("The point is origen ");
        } else if (x == 0) {
            System.out.println("the point  lies on y axis ");
        } else if (y == 0) {
            System.out.println("the point lies on x axis ");
        } else {
            System.out.println("point is not matched");
        }
    }

}
