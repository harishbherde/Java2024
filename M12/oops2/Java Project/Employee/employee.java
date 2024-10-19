package employee;

public class employeeDriver {
	
	    public static void main(String[] args) {
	        
	        employee1 emp = new employee1("John Doe", 28, 50000);

	        
	        emp.setName("Jane Doe");
	        emp.setAge(30);
	        emp.setSalary(55000);

	      
	        emp.displayEmployeeDetails();
	    }
	}

