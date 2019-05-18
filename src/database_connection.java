
import java.sql.Connection;
import java.sql.DriverManager;
import java.lang.Exception;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class database_connection {
   
    Connection conn;
    public static Connection Connecrdb(){
        
        
        
        try {
          
            Connection  conn = DriverManager.getConnection("jdbc:derby://localhost:1527/knock","tanveer","123456");
            
    
            
            return conn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }  
}
