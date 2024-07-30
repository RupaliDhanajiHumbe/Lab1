package A;


abstract class Employee 
     {
		abstract double calculateSalary();
	    abstract void displayDetails();
	}

	class FullTimeEmployee extends Employee 
	{
	    double baseSalary;
	    double benefits;

	    public FullTimeEmployee(double baseSalary, double benefits)
	    {
	        this.baseSalary = baseSalary;
	        this.benefits = benefits;
	    }

	    @Override
	    double calculateSalary() 
	    {
	        return baseSalary + benefits;
	    }

	    @Override
	    void displayDetails() 
	    {
	        System.out.println("Full-Time Employee Details:");
	        System.out.println("Base Salary:- " + baseSalary);
	        System.out.println("Benefits:- " + benefits);
	        System.out.println("Total Salary:- " + calculateSalary());
	    }
	}

	class PartTimeEmployee extends Employee
	{
	 double hourlyRate;
	 int hoursWorked;

	 public PartTimeEmployee(double hourlyRate, int hoursWorked)
	 {
	     this.hourlyRate = hourlyRate;
	     this.hoursWorked = hoursWorked;
	 }

	 @Override
	 double calculateSalary()
	 {
	     return hourlyRate * hoursWorked;
	 }

	 @Override
	 void displayDetails() 
	  {
	     System.out.println("Part-Time Employee Details:");
	     System.out.println("Hourly Rate:- " + hourlyRate);
	     System.out.println("Hours Worked:- " + hoursWorked);
	     System.out.println("Total Salary:- " + calculateSalary());
	 }


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FullTimeEmployee Fe= new FullTimeEmployee(45000, 8000);
	    Fe.displayDetails();

	    PartTimeEmployee Pe = new PartTimeEmployee(18, 90);
	    Pe.displayDetails();
	}

}