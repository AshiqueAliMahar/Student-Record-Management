
package BAL;

import Connection.DBConn;
import bean.StudentBean;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class StudentBAL {
    
    Connection con=DBConn.ConnectDB();
    
    public ArrayList<StudentBean> selectAllStudents(){
        ArrayList<StudentBean> list=new ArrayList<StudentBean>();
        try {
            Statement statement = con.createStatement();
            String query="SELECT id,sname,temp_add,perm_add FROM students";
            ResultSet rs = statement.executeQuery(query);
            while(rs.next()){
                int id=rs.getInt(1);
                String sname=rs.getString(2);
                String tempadd=rs.getString(3);
                String permadd=rs.getString(4);
                StudentBean s=new StudentBean(id,sname,tempadd,permadd);
                list.add(s);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Connection not created "+ex.getMessage(),"Title", 2);
        }
        return list;
    }// select data method ends
    
    //----------------------------------------------------------------------------------
    
    public void insertStudent(String name, String tempadd,String permadd){
        try {
            Statement statement = con.createStatement();
            String query="INSERT INTO students(sname,temp_add,perm_add) VALUES ('"+name+"','"+tempadd+"','"+permadd+"')";
            int row=statement.executeUpdate(query);
            if(row==0){
                JOptionPane.showMessageDialog(null,"no data inserted");
            }else{
                JOptionPane.showMessageDialog(null,"data inserted");
            }
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Connection not created "+ex.getMessage(),"Title", 2);
        }
    }// insert data method ends
    
    //---------------------------------------------------------------------------------------
    public void updateStudent(int id, String name, String tempadd, String permadd){
        try {
            
            Statement statement = con.createStatement();
            String query="UPDATE students SET sname = '"+name+"',temp_add = '"+tempadd+"',perm_add = '"+permadd+"' WHERE id = "+id;
            int row=statement.executeUpdate(query);
            if(row==0){
                JOptionPane.showMessageDialog(null,"no data updated");
            }else{
                JOptionPane.showMessageDialog(null,"data updated");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Connection not created "+ex.getMessage(),"Title", 2);
        }
    }// update data method ends
       
    //-----------------------------------------------------------------------------------------------
    public void deleteStudent(int id){
        try {
            Statement statement = con.createStatement();
            String query="DELETE FROM students WHERE id = "+id;
            int row=statement.executeUpdate(query);
            if(row==0){
                JOptionPane.showMessageDialog(null,"no data deleted");
            }else{
                    JOptionPane.showMessageDialog(null,"data deleted");
            }
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Connection not created "+ex.getMessage(),"Title", 2);
        }
    }// delete data method ends
    
    
    
    
    
    
}
