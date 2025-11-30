package Controller;

import Model.PasswordModel;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PasswordController {
    
    public static Connection getJDBCConnection(){
        
        String url = "jdbc:mysql://localhost:3306/dangnhap";
        String user = "root";
        String password = "116120";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PasswordController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PasswordController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public boolean login(String username, String password){
        Connection cnt = getJDBCConnection();
        
        String sql = "SELECT * FROM account001 WHERE Username = ? AND Password = ?";
        
        try {
            PreparedStatement ps = cnt.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                return true;
            } else{
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(PasswordController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
    
    public void register(PasswordModel pm){
        Connection cnt = getJDBCConnection();
        
        String sql = "INSERT INTO account001(username, password) VALUE (?, ?)";
        
        try {
            PreparedStatement ps = cnt.prepareStatement(sql);
            ps.setString(1, pm.getUsername());
            ps.setString(2, pm.getPassword());
            
            int rs = ps.executeUpdate();
            
            if(rs != 0){
                System.out.println("Them thanh cong !");
            } else{
                System.out.println("Them that bai !");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(PasswordController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
