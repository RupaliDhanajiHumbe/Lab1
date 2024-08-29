package Stream_API;

import java.util.ArrayList;
import java.util.List;

public class Student1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student2> Studentlist=new ArrayList<>();
		Studentlist.add(new Student2("Rupali",75));
		Studentlist.add(new Student2("Rahul",65));
		Studentlist.add(new Student2("Deepti",71));
		Studentlist.add(new Student2("Varsha",67));
		
	
		Student2 minProduct=Studentlist.stream().min((l1,l2)->l1.getMarks()>l2.getMarks()?1:-1).get();
		System.out.println(minProduct.getName()+ " "+minProduct.getMarks());
		System.out.println();
		
		Student2 maxProduct=Studentlist.stream().max((l1,l2)->l1.getMarks()>l2.getMarks()?1:-1).get();
		System.out.println(maxProduct.getName()+ " "+maxProduct.getMarks());
		System.out.println();
	}

}

class Student2
{
	String Name;
	int marks;
	public Student2(String Name, int marks) {
		// TODO Auto-generated constructor stub
		this.Name=Name;
		this.marks=marks;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
}