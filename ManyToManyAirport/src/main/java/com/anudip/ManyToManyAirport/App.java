package com.anudip.ManyToManyAirport;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration conf=new Configuration().configure().addAnnotatedClass(Flight.class).addAnnotatedClass(Passanger.class);
    	SessionFactory sFactory=conf.buildSessionFactory();
    	Session session=sFactory.openSession();
    	Transaction t1=session.beginTransaction();
    	
    	List<Passanger> passangers1=new ArrayList<>();
    	List<Passanger> passangers2=new ArrayList<>();
    	
    	List<Flight>flights1 =new ArrayList<>();
    	List<Flight>flights2 =new ArrayList<>();
    	List<Flight>flights3 =new ArrayList<>();
    
    	Flight f1=new Flight();
    	f1.setFlightId(101);
    	f1.setFlightName("Indigo-a1002");
    	f1.setFlighttroute("AhmedabadToDelhi");
   
    	Flight f2=new Flight();
    	f2.setFlightId(102);
    	f2.setFlightName("Indigo-a1003");
    	f2.setFlighttroute("DelhiToKashmir");
    	
    	Flight f3=new Flight();
    	f3.setFlightId(103);
    	f3.setFlightName("Indigo-a1004");
    	f3.setFlighttroute("MumbaiToDelhi");
    	
    	flights1.add(f1);
    	flights1.add(f2);
    	flights2.add(f2);
    	flights2.add(f3);
    	
    	Passanger p1=new Passanger();
    	p1.setPid(11);
    	p1.setPname("Ram");
    	p1.setPemail("Ram@gmail.com");
    	
    	Passanger p2=new Passanger();
    	p2.setPid(12);
    	p2.setPname("Raj");
    	p2.setPemail("Raj@gmail.com");
    	
    	Passanger p3=new Passanger();
    	p3.setPid(13);
    	p3.setPname("Ramesh");
    	p3.setPemail("Ramesh@gmail.com");
    	
    	p1.setFlights(flights2);
    	p2.setFlights(flights2);
    	p3.setFlights(flights1);
    	
    	session.persist(p1);
    	session.persist(p2);
    	session.persist(p3);
    	
    	t1.commit();
    
    }
}
