package Model;

public class SanPhamModel {
    private String idSanPham ;
    private String tenSanPham ;
    private String idNhaCung ;
    private String idNhanVien ;

    public String getIdSanPham() {
        return idSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public String getIdNhaCung() {
        return idNhaCung;
    }

    public String getIdNhanVien() {
        return idNhanVien;
    }

    public void setIdSanPham(String idSanPham) {
        this.idSanPham = idSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public void setIdNhaCung(String idNhaCung) {
        this.idNhaCung = idNhaCung;
    }

    public void setIdNhanVien(String idNhanVien) {
        this.idNhanVien = idNhanVien;
    }
}
