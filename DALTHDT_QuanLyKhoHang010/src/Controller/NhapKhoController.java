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
    
    public boolean TraVeTrueFalse(String ID_NCC, String ID_Kho) {
    
        if (!KiemTra("nhacungcap", "ID_NCC", ID_NCC)) return false;
        if (!KiemTra("khoquanly", "ID_Kho", ID_Kho)) return false;

    return true;
    }

    private boolean KiemTra(String tenBang, String tenCot, String giaTri) {
        
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
    
    public java.util.List<NhapKhoModel> getSanPhamTheoID(String idNCC, String idKho) {
        
        java.util.List<NhapKhoModel> list = new java.util.ArrayList<>();
        String sql = "SELECT * FROM sanpham WHERE ID_NCC = ? AND ID_Kho = ?";

        try (Connection cnt = JDBCUtil.getConnection();
             PreparedStatement ps = cnt.prepareStatement(sql)) {

            ps.setString(1, idNCC);
            ps.setString(2, idKho);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                NhapKhoModel sp = new NhapKhoModel();
                sp.setID_SP(rs.getString("ID_SP"));
                sp.setTen_SP(rs.getString("Ten_SP"));
                sp.setMauSac(rs.getString("MauSac"));
                sp.setSize(rs.getString("Size"));
                sp.setSoLuong(rs.getInt("SoLuong"));
                sp.setKe(rs.getString("Ke"));
                sp.setTang(rs.getString("Tang"));
                list.add(sp);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }
    
//    public boolean updateSoLuong(int soLuong, String idNCC, String idKho, String mauSac, String size) {
//        String sql = "UPDATE sanpham SET SoLuong = ? WHERE ID_NCC = ? AND ID_Kho = ? AND MauSac = ? AND Size = ?";
//
//        try (Connection cnt = JDBCUtil.getConnection();
//             PreparedStatement ps = cnt.prepareStatement(sql)) {
//
//            ps.setInt(1, soLuong);
//            ps.setString(2, idNCC);
//            ps.setString(3, idKho);
//            ps.setString(4, mauSac);
//            ps.setString(5, size);
//
//            int rowsAffected = ps.executeUpdate();
//            return rowsAffected > 0;
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//            return false;
//        }
//    }
    
    public boolean addSoLuong(int soLuongThem, String idNCC, String idKho, String mauSac, String size) {
        
        String sql = "UPDATE sanpham SET SoLuong = SoLuong + ? "
                   + "WHERE ID_NCC = ? AND ID_Kho = ? AND MauSac = ? AND Size = ?";

        try (Connection cnt = JDBCUtil.getConnection();
             PreparedStatement ps = cnt.prepareStatement(sql)) {

            ps.setInt(1, soLuongThem); 
            ps.setString(2, idNCC);
            ps.setString(3, idKho);
            ps.setString(4, mauSac);
            ps.setString(5, size);

            int rowsAffected = ps.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
    
    public boolean subtractSoLuong(int soLuongXuat, String idNCC, String idKho, String mauSac, String size) {
        
        String checkSql = "SELECT SoLuong FROM sanpham WHERE ID_NCC = ? AND ID_Kho = ? AND MauSac = ? AND Size = ?";
        String updateSql = "UPDATE sanpham SET SoLuong = SoLuong - ? "
                         + "WHERE ID_NCC = ? AND ID_Kho = ? AND MauSac = ? AND Size = ? AND SoLuong >= ?";

        try (Connection cnt = JDBCUtil.getConnection()) {
            if (cnt == null) return false;

            try (PreparedStatement ps = cnt.prepareStatement(updateSql)) {
                ps.setInt(1, soLuongXuat);
                ps.setString(2, idNCC);
                ps.setString(3, idKho);
                ps.setString(4, mauSac);
                ps.setString(5, size);
                ps.setInt(6, soLuongXuat); 

                int rowsAffected = ps.executeUpdate();
                return rowsAffected > 0;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
}
