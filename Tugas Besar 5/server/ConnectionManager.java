package console;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
    
    static Connection con;
    static String url;
    
    public static Connection getConnection()
    {
        try
        {
            String url = "jdbc:mysql:" + "//localhost:3306/tb5";
            
            Class.forName("com.mysql.jdbc.Driver");
            try
            {
                con = DriverManager.getConnection(url, "root", "");
            }catch(SQLException e){
                System.out.println("SQL Error");
            }
        }catch(ClassNotFoundException ex){
            System.out.println(ex);
        }
    return con;
    }
}
