import java.sql.*;

public class LoadDriver{
   // JDBC driver name and database URL
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static final String DB_URL = "jdbc:mysql://localhost/Parking?allowPublicKeyRetrieval=true&useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

   //  Database credentials
   static final String USER = "root";
   static final String PASS = "root";
   
   public  Connection  createconnection() {
   Connection conn = null;

   try{
      //STEP 2: Register JDBC driver
      Class.forName("com.mysql.cj.jdbc.Driver");

      //STEP 3: Open a connection
      System.out.println("Connecting to database...");
      conn = DriverManager.getConnection(DB_URL,USER,PASS);      
   }catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
   }
 return conn;
}//end main
}//end FirstExample