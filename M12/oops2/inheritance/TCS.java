class TCS extends SoftwareCompany
{
	String hq;
	int employee;
	int projects;
	int loc;
	
	TCS()
	{
		
	}
	TCS(String name,String type,String ceo,double turnover,String hq,int emp,int projects,int loc)
	{
			this.name=name;
			this.type=type;
			this.ceo=ceo;
			this.turnover=turnover;
			
			this.hq=hq;
			this.emp=emp;
			this.projects=projects;
			this.loc=loc;
			
			
	}
	
	public void displayTCS()
	{
		displaySoftwareCompany();
		System.out.println("HeadQuarter :"+hq);
		System.out.println("Employee :"+emp);
		System.out.println("Projects Count :"+projects);
		System.out.println("Turnover Yearly :"+turnover);
		
	}
	
	
	
}