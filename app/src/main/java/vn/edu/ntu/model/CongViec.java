package vn.edu.ntu.model;

public class CongViec {
    String name, NgayBD, NgayKT, DiaDiem, TinhTrang;

    public CongViec(){

    }

    public CongViec(String name, String ngayBD, String ngayKT, String diaDiem, String tinhTrang) {
        this.name = name;
        NgayBD = ngayBD;
        NgayKT = ngayKT;
        DiaDiem = diaDiem;
        TinhTrang = tinhTrang;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNgayBD() {
        return NgayBD;
    }

    public void setNgayBD(String ngayBD) {
        NgayBD = ngayBD;
    }

    public String getNgayKT() {
        return NgayKT;
    }

    public void setNgayKT(String ngayKT) {
        NgayKT = ngayKT;
    }

    public String getDiaDiem() {
        return DiaDiem;
    }

    public void setDiaDiem(String diaDiem) {
        DiaDiem = diaDiem;
    }

    public String getTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        TinhTrang = tinhTrang;
    }
}
