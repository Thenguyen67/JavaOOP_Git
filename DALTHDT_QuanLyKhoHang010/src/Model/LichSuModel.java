package Model;

import java.sql.Timestamp;

public class LichSuModel extends NhapKhoModel{
    private String kieuHoaDon; // "N" cho Nhập, "X" cho Xuất
    private Timestamp date;
    private String idKho;

    public String getIdKho() {
        return idKho;
    }

    public void setIdKho(String idKho) {
        this.idKho = idKho;
    }
    
    public String getKieuHoaDon() {
        return kieuHoaDon; 
    }
    
    public void setKieuHoaDon(String kieuHoaDon) {
        this.kieuHoaDon = kieuHoaDon; 
    }
    
    public Timestamp getDate() {
        return date; 
    }
    
    public void setDate(Timestamp date) {
        this.date = date; 
    }
}
