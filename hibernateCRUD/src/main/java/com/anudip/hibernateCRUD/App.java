package com.anudip.hibernateCRUD;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Configuration conf = new Configuration().configure().addAnnotatedClass(Book.class);
    	SessionFactory sFactory = conf.buildSessionFactory();
        Session session = sFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Book b1=new Book();
        b1.setBid(101);
        b1.setBname("Who will cry when you die");
        b1.setBprice(400);
        session.save(b1);
        Book b2=new Book();
        b2.setBid(102);
        b2.setBname("Winning");
        b2.setBprice(700);
        session.save(b2);
       // transaction.commit();
        Book book=session.get(Book.class,103);     //102 are bid .are you get exception then you can change bid .like 104  
        if(book!=null)
        {
        	System.out.println("Book title:"+book.getBname());
        }
        else {
        	System.out.println("Book not found");
        }
        /*Book b3=session.get(Book.class, 102);  //delete  record
        session.delete(b3);
        transaction.commit();  */ 
        
        Book b4=session.get(Book.class, 102);
        b4.setBname("The monk who sold his Ferrary");
        b4.setBprice(600);
        session.save(b4);
        transaction.commit();
        
    }
}
