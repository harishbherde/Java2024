public class CalculaterImp implements Calculater{
	public CalculaterImp()
	{
	
	}
	public void areaofCircle(int rad)
	{
		System.out.println(Calculater.pi*(rad*rad));
	}
	public void areaofRectangle(int length,int breadth)
	{
		System.out.println(length*breadth);
	}
	public void areaofSquare(int side)
	{
		System.out.println(side*side);
	}
	public void areaofTringle(int base,int height)
	{
		System.out.println(0.5*base*height);
	}
}