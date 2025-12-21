package Controller;
 
import DBConnection.JDBCUtil;
import Model.NhaCungCapModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;


public class NhaCungCapController {
    public boolean RegisterNhaCungCap(NhaCungCapModel NCCModel) {

        String sql = "INSERT INTO nhacungcap(ID_NCC, Ten_NCC, SDT_NCC, Email_NCC, DiaChi_NCC) VALUES (?, ?, ?, ?, ?)";

        try (Connection cnt = JDBCUtil.getConnection();
             PreparedStatement ps = cnt != null ? cnt.prepareStatement(sql) : null) {

            if (cnt == null || ps == null) {
                return false; 
            }
        
            ps.setString(1, NCCModel.getID_NCC());
            ps.setString(2, NCCModel.getTen_NCC());
            ps.setString(3, NCCModel.getSDT_NCC());
            ps.setString(4, NCCModel.getEmail_NCC());
            ps.setString(5, NCCModel.getDiaChi_NCC());

            int rs = ps.executeUpdate();
            return rs > 0;

        } catch (SQLException ex) {
            ex.printStackTrace(); 
            return false;
        }
    }
    
    public List<NhaCungCapModel> getAllNCC() {
        List<NhaCungCapModel> list = new ArrayList<>();
        
        String sql = "SELECT * FROM nhacungcap";

        try (Connection cnt = JDBCUtil.getConnection();
             PreparedStatement ps = cnt != null ? cnt.prepareStatement(sql) : null;
             ResultSet rs = ps != null ? ps.executeQuery() : null) {

            if (rs != null) {
                while (rs.next()) {
                    NhaCungCapModel ncc = new NhaCungCapModel();

                    ncc.setID_NCC(rs.getString("ID_NCC"));
                    ncc.setTen_NCC(rs.getString("Ten_NCC"));
                    ncc.setSDT_NCC(rs.getString("SDT_NCC"));
                    ncc.setEmail_NCC(rs.getString("Email_NCC"));
                    ncc.setDiaChi_NCC(rs.getString("DiaChi_NCC"));
                    
                    list.add(ncc);
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }
}
