/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConnectionProvider;

import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
/**
 *
 * @author aman
 */
public class ConnectionProviderCode {
    public static Connection getCon(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentResultSystem", "root", "Mysqlpassword");
            return con;
        }
        catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null, e.toString());
                    return null;
                }
    }
    public static void main(String[] args) {
        ConnectionProviderCode con=new ConnectionProviderCode();
        Connection c=con.getCon();
    }
}