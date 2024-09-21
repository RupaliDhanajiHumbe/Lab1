package com.anudip.mavenProject_jdbcCrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PassengerManagementSystem {
	
	public void deletePassenger(int passengerid) {
		try(Connection con=DriverManager.getConnection(  
    		"jdbc:mysql://localhost:3306/anudipfoundation","Rupali","root"); 
    		PreparedStatement ps = con.prepareStatement("DELETE FROM passenger WHERE passengerid = ?")){
    	           ps.setInt(1, passengerid);
    	           ps.executeUpdate();
    	       } catch (SQLException e) {
    	           System.out.println(e);
    	       }
    	   }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        
        String url = "jdbc:mysql://localhost:3306/anudipfoundation";
        String user = "Rupali";
        String password = "root";

        try (Connection con = DriverManager.getConnection(url, user, password);
             PreparedStatement ps = con.prepareStatement("INSERT INTO passenger VALUES (?,?,?,?)")) 
          {
            Class.forName("com.mysql.cj.jdbc.Driver");
            int count=0;
            int number=5;
            while(count<number) 
            {
            System.out.println("Enter student passengerid:");
            int passengerid = sc.nextInt();
            
            System.out.println("Enter student passengerName:");
            String passengerName = sc.next();
            
            System.out.println("Enter student passengerEmail:");
            String passengerEmail = sc.next();
            
            System.out.println("Enter student passengerContact:");
            String passengerContact = sc.next();

            ps.setInt(1, passengerid);
            ps.setString(2, passengerName);
            ps.setString(3, passengerEmail);
            ps.setString(4,passengerContact);
            ps.executeUpdate();
            count++;
            }
            System.out.println("Record inserted successfully.");
    		
    		PreparedStatement ps1=con.prepareStatement("UPDATE passenger SET passengerName = ?, passengeremail = ?, passengercontact = ? WHERE passengerid = ?");
    		
    		System.out.println("Enter passenger details for update record");
    		System.out.println("Enter student passengerid:");
            int passengerid = sc.nextInt();
            System.out.println("Enter student passengerName:");
            String passengerName = sc.next();
            System.out.println("Enter student passengerEmail:");
            String passengerEmail = sc.next();
            System.out.println("Enter student passengerContact:");
            String passengerContact = sc.next();
    		
               ps1.setInt(1, passengerid);
			   ps1.setString(2, passengerName);
		       ps1.setString(3, passengerEmail);
			   ps1.setString(4, passengerContact);
	           ps1.executeUpdate();
	           System.out.println("Record update successfully.");
            
	        PassengerManagementSystem passengerManage = new PassengerManagementSystem();
            passengerManage.deletePassenger(4);
            
			System.out.println("Record delete successfully.");
    		con.close();  
           
        } catch (SQLException e) {
            e.printStackTrace();
        }catch (ClassNotFoundException e){
        	e.printStackTrace();
        }	
	
	}
}
