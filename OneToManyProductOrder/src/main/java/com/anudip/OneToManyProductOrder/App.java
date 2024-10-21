package com.anudip.OneToManyProductOrder;

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
    	Configuration conf=new Configuration().configure().addAnnotatedClass(Product.class).addAnnotatedClass(OrderItem.class);
    	SessionFactory sFactory=conf.buildSessionFactory();
    	Session session=sFactory.openSession();
    	Transaction t1=session.beginTransaction();
    	
    	OrderItem o1=new OrderItem();
    	//o1.setOrderId(101);
    	o1.setOrderQuantity(5);
    	o1.setTotalPrice(73000);
    	List<Product> product=new ArrayList<>();
    	
    	Product p1=new Product();
    	//p1.setpId(101);
    	p1.setpName("Lenovo");
    	p1.setpPrice(38000);
    	p1.setPQuantity(3);
    	p1.setOrderItem(o1);
    	product.add(p1);
    	
    	Product p2=new Product();
    	//p2.setpId(102);
    	p2.setpName("HP");
    	p2.setpPrice(45000);
    	p2.setPQuantity(2);
    	p2.setOrderItem(o1);
    	product.add(p2);
    	
    	OrderItem o2=new OrderItem();
    	//o1.setOrderId(101);
    	o2.setOrderQuantity(4);
    	o2.setTotalPrice(75000);
    	List<Product> product1=new ArrayList<>();
    	
    	Product p3=new Product();
    	//p3.setpId(103);
    	p3.setpName("Lenovo");
    	p3.setpPrice(25000);
    	p3.setPQuantity(2);
    	p3.setOrderItem(o2);
    	product.add(p3);
    	
    	Product p4=new Product();
    	//p4.setpId(104);
    	p4.setpName("Dell");
    	p4.setpPrice(35000);
    	p4.setPQuantity(2);
    	p4.setOrderItem(o2);
    	product.add(p4);
    	
    	o1.setProduct(product);
    	o2.setProduct(product);
    	session.persist(o1);
    	session.persist(o2);
        t1.commit();    	
    
    }
}
