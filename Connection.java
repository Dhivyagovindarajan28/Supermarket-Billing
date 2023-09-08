import java.sql.*;
public class Connection {
   
    public static java.sql.Connection getConnection(){
       java.sql.Connection n = null;  
       try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           n=DriverManager.getConnection("jdbc:mysql://localhost/superm","root","root");
       }
       catch(Exception ex){
           System.out.println(ex);
       }  
    return n;
       
       
}
}
