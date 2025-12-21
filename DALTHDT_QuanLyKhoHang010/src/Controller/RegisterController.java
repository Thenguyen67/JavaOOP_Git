package Controller;

import Model.RegisterModel;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import DBConnection.JDBCUtil;

public class RegisterController {
    
    public boolean Register(RegisterModel rm) {

        String sql = "INSERT INTO taikhoannhanvien(ID, password, hoten, gioitinh, SDT, email, diachi, IDkho) VALUES (?, ?, ?, ?, ? , ?, ?, ?)";

        try (Connection cnt = JDBCUtil.getConnection();
             PreparedStatement ps = cnt != null ? cnt.prepareStatement(sql) : null) {

            if (cnt == null || ps == null) return false; 
        
            ps.setString(1, rm.getID());
            ps.setString(2, rm.getPassword());
            ps.setString(3, rm.getHoten());
            ps.setString(4, rm.getGioitinh());
            ps.setString(5, rm.getSDT());
            ps.setString(6, rm.getEmail());
            ps.setString(7, rm.getDiachi());
            ps.setString(8, rm.getIDkho());

            int rs = ps.executeUpdate();
            return rs > 0;

        } catch (SQLException ex) {
            ex.printStackTrace(); 
            return false;
        }
    }
}
