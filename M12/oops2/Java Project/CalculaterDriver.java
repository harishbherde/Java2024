public class CalculaterDriver{
	public static void main(String [] args)
	{
		Calculater c1 = new CalculaterImp();
	
      System.out.println(c1);
	c1.areaofCircle(20);
		c1.areaofSquare(20);
		Calculater.message();
	}
}