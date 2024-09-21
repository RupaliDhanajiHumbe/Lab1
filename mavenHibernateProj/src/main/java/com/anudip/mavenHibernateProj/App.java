package com.anudip.mavenHibernateProj;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
        
    	Configuration con1=new Configuration().configure().addAnnotatedClass(Student1.class);
    	
    	SessionFactory sessionFactory=con1.buildSessionFactory();
    	Session ss=sessionFactory.openSession();
    	Transaction t1=ss.beginTransaction();
    	Student1 s1=new Student1();
    	s1.setId(103);
    	s1.setName("Avi");
    	s1.setEmail("Avi@gmail.com");
    	
    	Student1 s2=new Student1();
    	s2.setId(102);
    	s2.setName("Rahul");
    	s2.setEmail("rahul@gmail.com");
    	
    	ss.save(s1);
    	ss.save(s2);
    	t1.commit();

    }
}
