
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;





public class con_new {
    
    Connection conn1;
    public static Connection Connecrdb(){
        
   
        try {
          
            Connection  conn1 = DriverManager.getConnection("jdbc:derby://localhost:1527/knock","tanveer","123456");
            
            
            return conn1;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }   
    
    
    
}
