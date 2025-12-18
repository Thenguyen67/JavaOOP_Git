package Model;

public class ThemMoiModel {
    private String ID_SP;
    private String ID_NCC;
    private String ID_Kho;
    private String Ten_SP;
    private String Kieu_SP;
    private String MauSac;
    private String Size;
    private int SoLuong;
    private String Ke;
    private String Tang;

    public String getID_SP() {
        return ID_SP;
    }

    public String getID_Kho() {
        return ID_Kho;
    }

    public void setID_Kho(String ID_Kho) {
        this.ID_Kho = ID_Kho;
    }

    public String getKe() {
        return Ke;
    }

    public String getTang() {
        return Tang;
    }

    public void setKe(String Ke) {
        this.Ke = Ke;
    }

    public void setTang(String Tang) {
        this.Tang = Tang;
    }

    public String getID_NCC() {
        return ID_NCC;
    }

    public String getTen_SP() {
        return Ten_SP;
    }

    public String getKieu_SP() {
        return Kieu_SP;
    }

    public String getMauSac() {
        return MauSac;
    }

    public String getSize() {
        return Size;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setID_SP(String ID_SP) {
        this.ID_SP = ID_SP;
    }

    public void setID_NCC(String ID_NCC) {
        this.ID_NCC = ID_NCC;
    }

    public void setTen_SP(String Ten_SP) {
        this.Ten_SP = Ten_SP;
    }

    public void setKieu_SP(String Kieu_SP) {
        this.Kieu_SP = Kieu_SP;
    }

    public void setMauSac(String MauSac) {
        this.MauSac = MauSac;
    }

    public void setSize(String Size) {
        this.Size = Size;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }
}
