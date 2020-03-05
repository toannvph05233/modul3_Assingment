package Controller;

public class NguoiDung {
    private String user;
    private String password;
    private String fullName;
    private int sdt;
    private int idloaiuser;
    private String loaiuser;

    public NguoiDung() {
    }

    public NguoiDung(String user, String password, String fullName, int sdt, int idloaiuser, String loaiuser) {
        this.user = user;
        this.password = password;
        this.fullName = fullName;
        this.sdt = sdt;
        this.idloaiuser = idloaiuser;
        this.loaiuser = loaiuser;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getSdt() {
        return sdt;
    }

    public void setSdt(int sdt) {
        this.sdt = sdt;
    }
    public int getIdloaiuser() {
        return idloaiuser;
    }

    public void setIdloaiuser(int idloaiuser) {
        this.idloaiuser = idloaiuser;
    }

    public String getLoaiuser() {
        return loaiuser;
    }

    public void setLoaiuser(String loaiuser) {
        this.loaiuser = loaiuser;
    }

}
