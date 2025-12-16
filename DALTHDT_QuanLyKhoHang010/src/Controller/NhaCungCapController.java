package Controller;
 
import DBConnection.JDBCUtil;
import Model.NhaCungCapModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


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
}
