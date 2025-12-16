package Model;

public class LoginModel {
    private String idUser;
    private String password;

    public LoginModel(String idUser, String password) {
        this.idUser = idUser;
        this.password = password;
    }

    public String getIdUser() {
        return idUser;
    }

    public String getPassword() {
        return password;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
