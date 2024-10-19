class Employee extends TCS
{
	String empname;
	int id ;
	double sal;
	String role;
	int exp;
	
	Employee()
	{
	}
	
	Employee(String name,String type,String ceo,double turnover,String hq,int emp,int projects,int loc,String empname,int id,double sal,String role,int exp)
	{
		
		
		this.name=name;
		this.type=type;
		this.ceo=ceo;
		this.turnover=turnover;
		
		this.hq=hq;
		this.emp=emp;
		this.projects=projects;
		this.loc=loc;
		
		this.empname=empname;
		this.id=id;
		this.sal=sal;
		this.role=role;
		this.exp=exp;
	}
	
	public void displayEmployee()
	{
		displayTCS();
		System.out.println("Emp name :"+empname);
		System.out.println("Emp Id :"+id);
		System.out.prinltn("Salary :"+sal);
		System.out.println("Role :"+role);
		System.out.println("Experiance :"+exp);
	}
	
	
}