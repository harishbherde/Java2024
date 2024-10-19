package OOPS;

public class Engine
{
	String fuel;
	int cc;
	double bhp;
	int wt;
	int cy;
	int stroke;

	public Engine()
	{
	
	}

	Engine(String fuel,int cc,double bhp,int wt,int cy,int stroke)
	{
		this.fuel=fuel;
		this.cc=cc;
		this.bhp=bhp;
		this.wt=wt;
		this.cy=cy;
		this.stroke=stroke;
	}
	public void displayEngine()
	{
		System.out.println("Fuel:"+fuel);
		System.out.println("Cc:"+cc);
		System.out.println("Weight:"+twt);
		System.out.println("Cylinder:"+cy);
		System.out.println("");
	}
}