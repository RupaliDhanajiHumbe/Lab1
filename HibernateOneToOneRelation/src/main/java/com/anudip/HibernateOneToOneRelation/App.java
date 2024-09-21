package com.anudip.HibernateOneToOneRelation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        Configuration con1=new Configuration().configure().addAnnotatedClass(Students.class).addAnnotatedClass(Laptop.class);
    	
    	SessionFactory sessionFactory=con1.buildSessionFactory();
    	Session ss=sessionFactory.openSession();
    	Transaction t1=ss.beginTransaction();
    	Students s1=new Students();
    	s1.setSid(10);
    	s1.setSname("Rupali");
    	s1.setContact("8756790345");
    	
    	Laptop l1=new Laptop();
    	l1.setLid(101);
    	l1.setBrand("Lenovo");
    	l1.setPrice(50000);
    	
        s1.setLaptop(l1);
        ss.persist(s1);
        
        t1.commit();

    }
}
