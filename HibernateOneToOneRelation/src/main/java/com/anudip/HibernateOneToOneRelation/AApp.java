package com.anudip.HibernateOneToOneRelation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Configuration con1=new Configuration().configure().addAnnotatedClass(AStudent.class).addAnnotatedClass(Address.class);
    	
    	SessionFactory sessionFactory=con1.buildSessionFactory();
    	Session ss=sessionFactory.openSession();
    	Transaction t1=ss.beginTransaction();
    	
    	AStudent s1=new AStudent();
    	s1.setId(11);
    	s1.setName("Rupali");
    	s1.setContact("9756790345");
    	Address a1=new Address();
        a1.setAid(111);
        a1.setAddress("Pune");
        a1.setState("Maharashtra");
        s1.setAddress1(a1);
        ss.persist(s1);
        
        
        AStudent s2=new AStudent();
    	s2.setId(12);
    	s2.setName("Rahul");
    	s2.setContact("8756790345");
    	Address a2=new Address();
        a2.setAid(112);
        a2.setAddress("Baramati");
        a2.setState("Maharashtra");
        s2.setAddress1(a2);
        ss.persist(s2);
        
        AStudent s3=new AStudent();
    	s3.setId(13);
    	s3.setName("Avishkar");
    	s3.setContact("7756790345");
    	Address a3=new Address();
        a3.setAid(113);
        a3.setAddress("Pandharpur");
        a3.setState("Maharashtra");
        s3.setAddress1(a3);
        ss.persist(s3);
        t1.commit();
	}

}
