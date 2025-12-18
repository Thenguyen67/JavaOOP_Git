package Controller;

import java.sql.Connection;
import java.sql.SQLException;
import DBConnection.JDBCUtil;
import Model.ThemMoiModel;
import java.sql.PreparedStatement;

public class ThemMoiController {
    
    public boolean RegisterNhapKho(ThemMoiModel rm) {
  
    String sql = "INSERT INTO sanpham(ID_SP, ID_NCC, ID_Kho, Ten_SP, Kieu_SP, MauSac, Size, SoLuong, Ke, Tang) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

    try (Connection cnt = JDBCUtil.getConnection();
         PreparedStatement ps = cnt != null ? cnt.prepareStatement(sql) : null) {

        if (cnt == null || ps == null) return false;

        ps.setString(1, rm.getID_SP());
        ps.setString(2, rm.getID_NCC());
        ps.setString(3, rm.getID_Kho());
        ps.setString(4, rm.getTen_SP());
        ps.setString(5, rm.getKieu_SP());
        ps.setString(6, rm.getMauSac());
        ps.setString(7, rm.getSize());
        ps.setInt(8, rm.getSoLuong());
        ps.setString(9, rm.getKe());
        ps.setString(10, rm.getTang());

        return ps.executeUpdate() > 0;

    } catch (SQLException ex) {
        ex.printStackTrace();
        return false;
    }
}
}
