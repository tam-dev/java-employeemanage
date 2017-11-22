import java.sql.*;
import javax.swing.*;

/**
 *
 * @author tam
 */
public class MysqlConnect {
    Connection conn = null;
    
    public static Connection ConnectDB(){
        try {
            
            Class.forName("com.mysql.jdbc.Driver"); // loading the driver
            
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_EmpDB","java_EmpDB","java_EmpDB");
            
//            JOptionPane.showMessageDialog(null, "Connection Successful");
            
            return conn;
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
