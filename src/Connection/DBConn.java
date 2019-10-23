
package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DBConn {

        public static Connection ConnectDB(){
        Connection connection=null;
        String ulr="jdbc:mysql://localhost:3306/muet";
        String user="root";
        String pass="";
        
        try {
            // regstring/loading database drivers into my program
            Class.forName("com.mysql.jdbc.Driver");
            // obtaing conncetion
            connection = DriverManager.getConnection(ulr, user, pass);
            
        
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Driver not Loaded","Title", 2);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Connection not created "+ex.getMessage(),"Title", 2);
        }
        return connection;
    }// connectoing method end
    
    
}
