package com.anudip.mavenProject_jdbcCrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PassengerManage {
	
	    private static final String url = "jdbc:mysql://localhost:3306/anudipfoundation";
	    private static final String username = "Rupali";
	    private static final String password = "root";

	    private Connection connection;

	    public PassengerManage() {
	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            connection = DriverManager.getConnection(url, username, password);
	            createTable();

	
       } catch (ClassNotFoundException | SQLException e) {
           System.out.println("Error connecting to database: " + e.getMessage());
       }
   }

   private void createTable() {
       try (Statement statement = connection.createStatement()) {
           statement.executeUpdate("CREATE TABLE IF NOT EXISTS passengers (" +
                   "passengerid INT AUTO_INCREMENT PRIMARY KEY, " +
                   "passengerName VARCHAR(50), " +
                   "passengeremail VARCHAR(100), " +
                   "passengercontact VARCHAR(20)" +
                   ")");
       } catch (SQLException e) {
           System.out.println("Error creating table: " + e.getMessage());
       }
   }

   public void createPassenger(String passengerName, String passengeremail, String passengercontact) {
       try (PreparedStatement ps = connection.prepareStatement("INSERT INTO passengers (passengerName, passengeremail, passengercontact) VALUES (?, ?, ?)")) {
           ps.setString(1, passengerName);
           ps.setString(2, passengeremail);
           ps.setString(3, passengercontact);
           ps.executeUpdate();
       } catch (SQLException e) {
           System.out.println("Error creating passenger: " + e.getMessage());
       }
   }

   public void updatePassenger(int passengerid, String passengerName, String passengeremail, String passengercontact) {
       try (PreparedStatement ps = connection.prepareStatement("UPDATE passengers SET passengerName = ?, passengeremail = ?, passengercontact = ? WHERE passengerid = ?")) {
           ps.setString(1, passengerName);
           ps.setString(2, passengeremail);
           ps.setString(3, passengercontact);
           ps.setInt(4, passengerid);
           ps.executeUpdate();
       } catch (SQLException e) {
           System.out.println("Error updating passenger: " + e.getMessage());
       }
   }

   public void deletePassenger(int passengerid) {
       try (PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM passengers WHERE passengerid = ?")) {
           preparedStatement.setInt(1, passengerid);
           preparedStatement.executeUpdate();
       } catch (SQLException e) {
           System.out.println("Error deleting passenger: " + e.getMessage());
       }
   }

   public void displayPassengers() {
       try (Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM passenger")) {
           while (resultSet.next()) {
               System.out.println("Passenger ID: " + resultSet.getInt("passengerid"));
               System.out.println("Passenger Name: " + resultSet.getString("passengerName"));
               System.out.println("Passenger Email: " + resultSet.getString("passengeremail"));
               System.out.println("Passenger Contact: " + resultSet.getString("passengercontact"));
               System.out.println();
           }
       } catch (SQLException e) {
           System.out.println("Error displaying passengers: " + e.getMessage());
       }
   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 PassengerManage passengerManage = new PassengerManage();

	        passengerManage.createPassenger("John Doe", "john.doe@example.com", "1234567890");
	        passengerManage.createPassenger("Jane Doe", "jane.doe@example.com", "0987654321");
	        passengerManage.createPassenger("Bob Smith", "bob.smith@example.com", "5551234567");
	        passengerManage.createPassenger("Alice Johnson", "alice.johnson@example.com", "5559876543");
	        passengerManage.createPassenger("Mike Brown", "mike.brown@example.com", "5555555555");

	       
	        passengerManage.displayPassengers();
	        passengerManage.updatePassenger(2, "Rahul", "rahul@example.com", "98457670994");
	        passengerManage.displayPassengers();
	        passengerManage.deletePassenger(4);
	        passengerManage.displayPassengers();

	}

}
