package ticketing;
import  java.sql.*;
public class conn {
    Connection con;
    Statement s;

    public conn(){
        try{
             Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost//ticket","Mashtura","qwerty123456");
            s=con.createStatement();
            
                 }
        catch(Exception e){
         System.out.println(e.toString());
        }
    }
}
