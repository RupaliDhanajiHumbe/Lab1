package B;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class ArrayL {
	
	public static void addEmployee(int eid ,String ename ,String eemail,int esalary,List employees1)
	{
		employees1.add(new Employee(eid,ename,eemail,esalary));
	}
		
		public static void updateEmployee(int eid ,String ename,String eemail,int esalary,List<Employee> employee1)
		{
			for(Employee e1:employee1)
		    {
				if(e1.getId()==eid)
					{
					e1.setName(ename);
					e1.setEmail(eemail);
					e1.setSalary(esalary);
					}
	        }
	}
					
	public static void display(List<Employee> employee1)
	{
		for(Employee e1:employee1)
	    {
		
			System.out.println(e1.getId()+" "+e1.getName()+" "+e1.getEmail()+" "+e1.getSalary());
	    }
	}
	
public static void delete(int eid,List<Employee> employee1)
{
   Iterator<Employee> iterator=employee1.iterator();
   while(iterator.hasNext())
   {
	   Employee employee=iterator.next();
	   if(employee.getId()==eid)
	   {
		   iterator.remove();	
	   }
   }
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> employees=new ArrayList<>();
		Scanner s=new Scanner(System.in);
		while(true)
		{
		  System.out.println("Enter your choice 1.add employee 2.display employee 3.update employee 4.delete employee ");
		  int input=s.nextInt();
		  if(input==1)
		  {
		  System.out.println("Enter the Id,Name,Email and Salary=");
	    
		int id=s.nextInt();
		String name=s.next();
		String email=s.next();
		int salary=s.nextInt();
		addEmployee(id,name,email,salary,employees);
}
		else if(input==2)
		{
		display(employees);
		}
		else if(input==3)
		{
			System.out.println("Enter the Id,Name,Email and Salary=");
		    
			int id=s.nextInt();
			String name=s.next();
			String email=s.next();
			int salary=s.nextInt();
			updateEmployee(id,name,email,salary,employees);	
		}
		else if(input==4)
		{
			System.out.println("Enter the Id,Name,Email and Salary=");
		    
			int id=s.nextInt();
			//String name=s.next();
			//String email=s.next();
			//int salary=s.nextInt();
			delete(id,employees);
		}
	}
  }
}

class Employee
{
	int id;
	String name;
	String email;
	int salary;
	
	public Employee(int id,String name,String email,int salary)
	
	{
		super();
		this.id=id;
		this.name=name;
		this.email=email;
		this.salary=salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
		
}