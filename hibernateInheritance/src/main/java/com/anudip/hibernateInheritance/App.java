package com.anudip.hibernateInheritance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration config=new Configuration().configure().addAnnotatedClass(Employee.class);
    	SessionFactory sf=config.buildSessionFactory();
    	Session ss=sf.openSession();
    	Transaction t1=ss.beginTransaction();  
    	Employee e1=new Employee();
    	e1.setEid(101);
    	e1.setEname("Rupali");
    	
    	Pemployee p1=new Pemployee();
    	p1.setEid(102);
    	p1.setEname("Anjali");
    	p1.setSalary(20000);
    	p1.setBonus(5000);
    	
    	Cemployee c1=new Cemployee();
    	c1.setEid(103);
    	c1.setEname("Rahul");
    	c1.setPerHour(500);
    	c1.setTotalHour(6000);
    	
    	ss.persist(e1);
    	ss.persist(p1);
    	ss.persist(c1);
    	t1.commit();
    }
}
