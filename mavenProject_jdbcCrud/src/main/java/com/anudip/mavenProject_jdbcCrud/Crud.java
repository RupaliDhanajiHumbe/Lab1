package com.anudip.mavenProject_jdbcCrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Crud {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{  
			Class.forName("com.mysql.jdbc.Driver"); 
			
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/anudipfoundation","Rupali","root");  
			//here anudipfoundation is database name, Rupali is username and password is root
			
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select *from Student");  
			while(rs.next())
			{
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
			}
			con.close();  
			}catch(Exception e){System.out.println(e);}
    }
}



		