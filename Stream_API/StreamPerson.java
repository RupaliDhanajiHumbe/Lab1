package Stream_API;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPerson {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		  List<Person> customer=new ArrayList<>(); customer.add(new
		  Person("Rahul",19,"New York")); customer.add(new Person("Ram",21,"Landon"));
		  customer.add(new Person("Ganesh",20,"New York")); customer.add(new
		  Person("Varsha",24,"New York")); customer.add(new Person("Swata",21,"Pune"));
		  
		  List<Person> CustomerAdults=customer.stream() .filter(c->c.getAge()>18 &&
		  c.getCity()=="New York") .collect(Collectors.toList());
		  
		  CustomerAdults.forEach(p->System.out.println(p.getName()+ " "+ p.getAge()+
		  " "+p.getCity()));
		  
		  }
	}
		  
		  
		  class Person { String name; int age; String city;
		  
		  public Person(String name,int age,String city) { this.name=name;
		  this.age=age; this.city=city; }
		  
		  public String getName() { return name; }
		  
		  public void setName(String name) { this.name = name; }
		  
		 public int getAge() { return age; }
		 
		  public void setAge(int age) { this.age = age; }
		  
		  public String getCity() { return city; }
		  
		  public void setCity(String city) { this.city = city;
		 
		
		
		}
		
		
		
	}
	
