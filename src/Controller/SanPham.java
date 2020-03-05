package Controller;

import java.util.Date;

public class SanPham {
    private String idSP;
    private String idLSP;
    private String nameSP;
    private float giaSP;
    private Date ngaynhapSP;
    private String img;

    public SanPham() {
    }

    public SanPham(String idSP, String idLSP, String nameSP, float giaSP, Date ngaynhapSP, String img) {
        this.idSP = idSP;
        this.idLSP = idLSP;
        this.nameSP = nameSP;
        this.giaSP = giaSP;
        this.ngaynhapSP = ngaynhapSP;
        this.img = img;
    }

    public String getIdSP() {
        return idSP;
    }

    public void setIdSP(String idSP) {
        this.idSP = idSP;
    }

    public String getIdLSP() {
        return idLSP;
    }

    public void setIdLSP(String idLSP) {
        this.idLSP = idLSP;
    }

    public String getNameSP() {
        return nameSP;
    }

    public void setNameSP(String nameSP) {
        this.nameSP = nameSP;
    }

    public float getGiaSP() {
        return giaSP;
    }

    public void setGiaSP(float giaSP) {
        this.giaSP = giaSP;
    }

    public Date getNgaynhapSP() {
        return ngaynhapSP;
    }

    public void setNgaynhapSP(Date ngaynhapSP) {
        this.ngaynhapSP = ngaynhapSP;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "idSP='" + idSP + '\'' +
                ", idLSP='" + idLSP + '\'' +
                ", nameSP='" + nameSP + '\'' +
                ", giaSP=" + giaSP +
                ", ngaynhapSP=" + ngaynhapSP +
                ", img='" + img + '\'' +
                '}';
    }
}
