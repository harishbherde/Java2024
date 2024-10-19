class car
{
    static int totalCars = 0;
    String model;
    car(String model) //Constructor
    {
        this.model = model;
        totalCars++;
    }
    static void displayTotalCars()
    {
        System.out.println("Total cars: "+totalCars);
    }
    void displayModel()
    {
        System.out.println("Car model: "+model);   
    }
}
public class Main
{
    public static void main(String [] args)
    {
        Car car1 = new Car("Toyota");
        Car car2 = new Car("Honda");

        car.displayTotalCars();

        car1.displayModel();
        car2.displayModel();
    }
}