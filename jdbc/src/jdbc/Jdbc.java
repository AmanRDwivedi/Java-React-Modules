package jdbc;

import java.sql.*;
public class Jdbc {

	 public static void main(String args[]) {
	    Connection con = null;    
		 Statement stmt = null;
	      try {
	    	  //forName() method of Class class is used to register the driver class.
	    	  // Java program is loading postgresql driver to esteblish database connection.
	         Class.forName("org.postgresql.Driver");
	         //getConnection() method of DriverManager - to establish connection
	           con = DriverManager
	            .getConnection("jdbc:postgresql://localhost:5432/prac2",
	            "postgres", "1234");
	           
	           System.out.println("Opened database successfully");
	         
	         stmt = con.createStatement();
	         
	        
	        String sql = "CREATE TABLE COMPANY " +
		            "(ID INT PRIMARY KEY     NOT NULL," +
		            " NAME           TEXT    NOT NULL, " +
		            " AGE            INT     NOT NULL, " +
		            " ADDRESS        CHAR(50), " +
		            " SALARY         REAL)";
		       
	        //stmt.executeUpdate(sql);
		         stmt.close();
		         con.close();
	         
	      } catch (Exception e) {
	    	  //print the exceptions so errors can be solved
	         e.printStackTrace();
	         System.err.println(e.getClass().getName()+": "+e.getMessage());
	         System.exit(0);
	      }
	    
	      System.out.println("Table created successfully");
	      
	    
	     
	      
	   }
}