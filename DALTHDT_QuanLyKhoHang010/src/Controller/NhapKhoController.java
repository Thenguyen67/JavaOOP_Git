package Controller;

import DBConnection.JDBCUtil;
import Model.NhapKhoModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class NhapKhoController {
    
    public boolean RegisterNhapKho(NhapKhoModel rm) {

        String sql = "INSERT INTO sanpham(ID_SP, ID_NCC, Ten_SP, Kieu_SP, MauSac, Size, SoLuong) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection cnt = JDBCUtil.getConnection();
             PreparedStatement ps = cnt != null ? cnt.prepareStatement(sql) : null) {

            if (cnt == null || ps == null) {
                return false; 
            }
        
            ps.setString(1, rm.getID_SP());
            ps.setString(2, rm.getID_NCC());
            ps.setString(3, rm.getTen_SP());
            ps.setString(4, rm.getKieu_SP());
            ps.setString(5, rm.getMauSac());
            ps.setString(6, rm.getSize());
            ps.setInt(7, rm.getSoLuong());

            int rs = ps.executeUpdate();
            return rs > 0;

        } catch (SQLException ex) {
            ex.printStackTrace(); 
            return false;
        }
    }
    
    public boolean KiemTraTonTai(String ID_NCC, String ID_SP, String ID_Kho) {
    
        if (!checkTonTai("nhacungcap", "ID_NCC", ID_NCC)) return false;
        if (!checkTonTai("sanpham", "ID_SP", ID_SP)) return false;
        if (!checkTonTai("khoquanly", "ID_Kho", ID_Kho)) return false;

    return true;
    }

    private boolean checkTonTai(String tenBang, String tenCot, String giaTri) {
        String sql = "SELECT 1 FROM " + tenBang + " WHERE " + tenCot + " = ?";
    
        try (Connection cnt = JDBCUtil.getConnection();
            PreparedStatement ps = cnt != null ? cnt.prepareStatement(sql) : null) {
         
            if (cnt == null || ps == null) return false;
        
            ps.setString(1, giaTri);
            ResultSet rs = ps.executeQuery();
            return rs.next();
        
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
    
    public void view(){
        
    }
}
