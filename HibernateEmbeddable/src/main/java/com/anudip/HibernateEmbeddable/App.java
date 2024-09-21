package com.anudip.HibernateEmbeddable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration config=new Configuration().configure().addAnnotatedClass(User.class);
     	
     	SessionFactory sessionFactory=config.buildSessionFactory();
     	Session ss=sessionFactory.openSession();
     	Transaction t1=ss.beginTransaction();
     	
     	User u1=new User();
        u1.setUname("Varsha");
        u1.setEmail("varsha@gmail.com");
        Address ad1=new Address();
        ad1.setAddress1("c/69");
        ad1.setAddress2("Lakshmi nagar");
        ad1.setCity("Dhondewadi");
        ad1.setPincode("413310");
        
        u1.setAddress(ad1);
        ss.persist(u1);
        
        User u2=new User();
        u2.setUname("Payal");
        u2.setEmail("payal@gmail.com");
        Address ad2=new Address();
        ad2.setAddress1("D/70");
        ad2.setAddress2("Shivaji nagar");
        ad2.setCity("Pune");
        ad2.setPincode("413310");
        
        u2.setAddress(ad2);
        ss.persist(u2);
        t1.commit();    
        
    }
}
