package Controller;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;

public class SanPhamController {
    public Connection getJBDCConnection(){
        
        String url = "jdbc:mysql://localhost:3306/dangnhap";
        String user = "root";
        String password = "116120";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SanPhamController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public boolean KiemTraSPTonTai(String ID_SanPham,String TenSanPham, String ID_NhaCung, String ID_NhanVien){
        
        Connection cnt = getJBDCConnection();
        
        String sql = "SELECT * FROM sanpham WHERE ID_SP = ? AND TenSP = ? AND ID_NhaCung = ? AND ID_NhanVien = ?";
        
        try {
            PreparedStatement ps = cnt.prepareStatement(sql);
            
            ps.setString(1, ID_SanPham);
            ps.setString(2, TenSanPham);
            ps.setString(3, ID_NhaCung);
            ps.setString(4, ID_NhanVien);
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                return true;
            } else{
                return false;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false; 
    }
}
