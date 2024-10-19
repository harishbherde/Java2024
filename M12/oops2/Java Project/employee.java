package employee;

class Employee {
	

	    
	    private String name;
	    private int age; 
	    private double salary;

	    
	    public Employee(String name, int age, double salary) {
	        this.name = name;
	        this.age = age;
	        this.salary = salary;
	    }

	    
	    public String getName() {
	        return name;
	    }

	    
	    public void setName(String name) {
	        this.name = name;
	    }

	    
	    public int getAge() {
	        return age;
	    }

	    
	    public void setAge(int age) {
	        if(age > 0) { 
	            this.age = age;
	        } else {
	            System.out.println("Age cannot be negative.");
	        }
	    }

	    
	    public double getSalary() {
	        return salary;
	    }

	    
	    public void setSalary(double salary) {
	        if(salary > 0) { 
	            this.salary = salary;
	        } else {
	            System.out.println("Salary cannot be negative.");
	        }
	    }

	    
	    public void displayEmployeeDetails() {
	        System.out.println("Employee Name: " + name);
	        System.out.println("Employee Age: " + age);
	        System.out.println("Employee Salary: " + salary);
	    }
	}
