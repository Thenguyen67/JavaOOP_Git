package Model;

public class RegisterModel {
    private String ID;
    private String password;
    private String hoten;
    private String gioitinh;
    private String SDT;
    private String email;
    private String diachi;
    private String IDkho;

    public RegisterModel(String ID, String password, String hoten, String gioitinh, String SDT, String email, String diachi, String IDkho) {
        this.ID = ID;
        this.password = password;
        this.hoten = hoten;
        this.gioitinh = gioitinh;
        this.SDT = SDT;
        this.email = email;
        this.diachi = diachi;
        this.IDkho = IDkho;
    }

    public RegisterModel() {
    }
    
    public String getID() {
        return ID;
    }

    public String getPassword() {
        return password;
    }

    public String getHoten() {
        return hoten;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public String getSDT() {
        return SDT;
    }

    public String getEmail() {
        return email;
    }

    public String getDiachi() {
        return diachi;
    }

    public String getIDkho() {
        return IDkho;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public void setIDkho(String IDkho) {
        this.IDkho = IDkho;
    }
    
    
}
