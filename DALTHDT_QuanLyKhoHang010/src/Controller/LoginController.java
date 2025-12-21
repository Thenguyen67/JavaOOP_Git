package Controller;

import java.sql.Connection;
import DBConnection.JDBCUtil;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoginController {
    
    public Connection getConnectionForLogin() {
        return JDBCUtil.getConnection();
    }
    
    public boolean login(String ID, String password){
        
        Connection cnt = JDBCUtil.getConnection();
        
        String sql = "SELECT * FROM taikhoannhanvien WHERE ID = ? AND password = ?";
        
        try {
            PreparedStatement ps = cnt.prepareStatement(sql);
            ps.setString(1, ID);
            ps.setString(2, password);
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                return true;
            } else{
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
}
