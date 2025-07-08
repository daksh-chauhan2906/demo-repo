//database connection program
package travel.management.system;

import java.sql.*;

public class Conn {
    Connection c;
    Statement s;
    
    Conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");//1. Register the driver class.
            //here slash'/' in url must be proper as given
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/travelmanagementsystem", "root", "daksh");// 2.
            s = c.createStatement();// 3.
              
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
    

