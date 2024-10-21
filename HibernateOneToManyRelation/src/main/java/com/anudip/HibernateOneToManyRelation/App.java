package com.anudip.HibernateOneToManyRelation;

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
       Configuration config=new Configuration().configure().addAnnotatedClass(Doctor.class).addAnnotatedClass(Appointment.class);
     	
     	SessionFactory sessionFactory=config.buildSessionFactory();    //use to create the object
     	Session session=sessionFactory.openSession();             
     	Transaction t1=session.beginTransaction();
     	
     	Doctor d1=new Doctor();
         d1.setdName("Ram");
         d1.setQualifaction("BMAD");
         d1.setSpeciality("Doctor");
         List<Appointment>appointments=new ArrayList<>();
         
         Appointment a1=new Appointment();
         a1.setFullName("Rahul Humbe");
         a1.setLocation("Baramati");
         a1.setContactNumber("87649056342");
         a1.setSpeciality("Advocate");
         
         Appointment a2=new Appointment();
         a2.setFullName("Rupali Humbe");
         a2.setLocation("Pune");
         a2.setContactNumber("95649056342");
         a2.setSpeciality("Developer");
         
         a1.setDoctor(d1);
         a2.setDoctor(d1);
         appointments.add(a1);
         appointments.add(a2);
         
         d1.setAppointments(appointments);
         session.persist(d1);
         t1.commit();
         
     	
    }
}
