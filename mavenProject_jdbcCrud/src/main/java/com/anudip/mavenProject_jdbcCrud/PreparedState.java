package com.anudip.mavenProject_jdbcCrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedState {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc = new Scanner(System.in);
	        
	        String url = "jdbc:mysql://localhost:3306/employee1";
	        String user = "Rupali";
	        String password = "root";

	        try (Connection con = DriverManager.getConnection(url, user, password);
	             PreparedStatement ps = con.prepareStatement("INSERT INTO employee VALUES (?,?,?)")) 
	           {

	            Class.forName("com.mysql.cj.jdbc.Driver");
	            int number=5;
	            int count=0;
	            while(count<number) 
	            {
	            System.out.println("Enter student id:");
	            int id = sc.nextInt();
	            
	            System.out.println("Enter student Name:");
	            String name = sc.next();
	            
	            System.out.println("Enter student salary:");
	            Float salary = sc.nextFloat();

	            ps.setInt(1, id);
	            ps.setString(2, name);
	            ps.setFloat(3,salary);
	            ps.executeUpdate();
	            count++;
	            }
	            
	            System.out.println("Record inserted successfully.");
	            
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }catch (ClassNotFoundException e){
	        	e.printStackTrace();
	        }
		
	}

}
