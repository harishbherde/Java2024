class SoftwareComapany
{
	String name ;
	String type ;
	String ceo ;
	double turnover ;
	
	SoftwareComapany()
	{
	}
	
	SoftwareCompany(Stirng name,String type,String ceo,double turnover)
	{
		this.name=name;
		this.type=type;
		this.ceo=ceo;
		this.turnover=turnover;
	}
	
	public void displaySoftwareCompany()
	{
		System.out.println("Comapny Name :"+name);
		System.out.println("Company Type :"+type);
		System.out.println("Ceo Name :"+ceo);
		System.out.println("Comapny turnover :"+turnover);
	}
}