package B;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class StudentManagement {

	public static void addStudent(int sid ,String sname,String saddress,List students1)
	{
		students1.add(new Student(sid,sname,saddress));
	}

	public static void updateStudent(int sid ,String sname,String saddress,List<Student> student1)
	{
		for(Student s1:student1)
	    {
			if(s1.getId()==sid)
				{
				s1.setName(sname);
				s1.setAddress(saddress);
				}
        }
}	
	
	public static void display(List<Student> student1)
	{
		for(Student s1:student1)
	    {
			System.out.println(s1.getId()+" "+s1.getName()+" "+s1.getAddress());
	    }
	}
	
	public static void delete(int sid,List<Student> student1)
	{
	   Iterator<Student> iterator=student1.iterator();
	   while(iterator.hasNext())
	   {
		   Student student=iterator.next();
		   if(student.getId()==sid)
		   {
			   iterator.remove();	
		   }
	   }
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Student> students=new ArrayList<>();
		Scanner s=new Scanner(System.in);
		while(true)									
		{
		  System.out.println("Enter your choice 1.add student 2.display student 3.update student 4.delete student ");
		  int input=s.nextInt();
		  if(input==1)
		  {
		  System.out.println("Enter the Id,Name,address=");
	    
		int sid=s.nextInt();
		String sname=s.next();
		String saddress=s.next();
		
		addStudent(sid,sname,saddress,students);
}
		else if(input==2)
		{
		display(students);
		}
		else if(input==3)
		{
			System.out.println("Enter the Id,Name,Address=");
		    
			int sid=s.nextInt();
			String sname=s.next();
			String saddress=s.next();
			updateStudent(sid,sname,saddress ,students);	
		}
		else if(input==4)
		{
			System.out.println("Enter the Id,Name,address=");
		    
			int sid=s.nextInt();
			delete(sid,students);
		}
	}
  }
}

class Student
{
	int id;
	String name;
	String address;
	
	public Student(int sid,String sname,String saddress)
	
	{
		super();
		this.id=id;
		this.name=name;
		this.address=address;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
}
