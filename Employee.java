class Employee
{
   String Ename;
   int Eid;
   String Email;
   static String department="Software Developer";

public Employee(String name ,int id,String email)
   {
  Ename=name;
  Eid=id;
  Email=email;
   }
public void display()
  {
System.out.println(this.Ename+" "+this.Eid+" "+this.Email+department);
  }
public static void main(String[] args)
   {
Employee e1=new Employee("Ram",101,"ram123@gamil.com");
e1.display();
Employee e2=new Employee("Shita",102,"shita12@gamil.com");
e2.display();
Employee e3=new Employee("Gita",103,"gita123@gamil.com");
e3.display();
      }
 }

