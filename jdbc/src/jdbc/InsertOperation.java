package jdbc;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class InsertOperation {
public static void main(String[] args) {
	 Connection c = null;
     Statement stmt = null;
    
     try {
        Class.forName("org.postgresql.Driver");
        c = DriverManager
           .getConnection("jdbc:postgresql://localhost:5432/prac2",
           "postgres", "1234");
        c.setAutoCommit(false);
        System.out.println("Opened database successfully");
        
        stmt = (Statement) c.createStatement();
        String sqlq = "INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY) "
                + "VALUES (1, 'Aman', 22, 'Mumbai', 560000.00 );";
        stmt.execute();
        
        
        
        ((Connection) stmt).close();
        c.commit();
        c.close();

     } catch (Exception e) {
         System.err.println( e.getClass().getName()+": "+ e.getMessage() );
         System.exit(0);
      }
      System.out.println("Records created successfully");
   }
}