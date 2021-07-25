/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumni_system;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class MySqlConnect {
Connection con=null;
    static Connection ConnectDB() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con;
            con = DriverManager.getConnection("jdbc:mysql://localhost/dbms","root","Misbah@04");
            JOptionPane.showMessageDialog(null, "connected to database");
            return con;
        }
        catch(HeadlessException | ClassNotFoundException | SQLException e){
        JOptionPane.showMessageDialog(null,e);
}
        return null;
        
    }
}
