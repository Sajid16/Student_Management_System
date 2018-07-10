/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagement;

import java.sql.*;
import javax.swing.table.DefaultTableModel;
//import sun.security.util.Password;
/**
 *
 * @author sajid
 */
public class DBManagement {
    
    String conString = "jdbc:mysql://localhost:3306/student_management";
    String username = "root";
    String password = "sajid";
    
    
    
    
    //ADD INFO TO DATABASE
    public Boolean student_add(String id,String name,String department,String cgpa,String cellno,String username,String password, String dob,String email,String attendance)
            {
                String sql = "Insert INTO student(id,name,department,cgpa,cellno,username,password,dob,email,attendance) VALUES('"+id+"','"+name+"';'"+department+"';'"+cgpa+"';'"+cellno+"';'"+username+"';'"+password+"';'"+dob+"';'"+email+"';'"+attendance+"')";
                try
                {
                    Connection con = DriverManager.getConnection(conString,username,password);
                    
                    Statement s=con.prepareStatement(sql);
                    
                    s.execute(sql);
                    
                    return true;
                }
                catch(Exception ex)
                {
                   ex.printStackTrace();
                }
                return false;
            }
    
    //RETRIEVE DATA
    public DefaultTableModel getData() throws SQLException
    {
        //ADD COLUMNS TO TABLE MODEL
        DefaultTableModel dm = new DefaultTableModel();
        dm.addColumn("Id");
        dm.addColumn("Name");
        dm.addColumn("Department");
        dm.addColumn("CGPA");
        dm.addColumn("Cell no.");
        dm.addColumn("User name");
        dm.addColumn("Password"); 
        dm.addColumn("DOB");
        dm.addColumn("E-mail");
        dm.addColumn("Attendance");
        
        //SQL STATEMENT
        String sql = "SELECT * FROM student";
        try
        {
            Connection con = DriverManager.getConnection(conString,username,password);
            
            //PREPARED STATEMENT
            Statement s = con.prepareStatement(sql);
            ResultSet rs = s.executeQuery(sql);
            //LOOP THROUGH ALL VALUES
            while(rs.next())
            {
                //GET VALUES
                String Id = rs.getString(1);
                String Name = rs.getString(2);
                String Department = rs.getString(3);
                String CGPA = rs.getString(4);
                String Cellno = rs.getString(5);
                String Username = rs.getString(6);
                String Password = rs.getString(7);
                String DOB = rs.getString(8);
                String Email = rs.getString(9);
                String Attendance = rs.getString(10);
                
                dm.addRow(new String[]{Id,Name,Department,CGPA,Cellno,Username,Password,DOB,Email,Attendance});       
            }
            return dm;
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        
        return null;
    }
    
    public Boolean update(String id,String name,String department,String cgpa,String cellno,String username,String password, String dob,String email,String attendance)
    {
        String sql = "UPDATE student SET Name ='"+name+"',Department='"+department+"',CGPA='"+cgpa+ "',Cellno='"+cellno+"',"
                + "Username='"+username+"',Password='"+password+"',DOB='"+dob+"',Email='"+email+"',Attendance='"+attendance+"'";
        
        
        
        
        
        return true;
    }
    
    public static void main(String arg[])
    {
        new DBManagement();
    }
}
