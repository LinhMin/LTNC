package Domain;
// Generated Nov 11, 2017 4:10:56 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Nhanvien generated by hbm2java
 */
public class Nhanvien  implements java.io.Serializable {


     private Integer maNv;
     private String tenNv;
     private Date ngaySinh;
     private String gioiTinh;
     private String sdt;
     private String chucVu;
     private String queQuan;
     private Set<Donhang> donhangs = new HashSet<Donhang>(0);

    public Nhanvien() {
    }

    public Nhanvien(String tenNv, Date ngaySinh, String gioiTinh, String sdt, String chucVu, String queQuan, Set<Donhang> donhangs) {
       this.tenNv = tenNv;
       this.ngaySinh = ngaySinh;
       this.gioiTinh = gioiTinh;
       this.sdt = sdt;
       this.chucVu = chucVu;
       this.queQuan = queQuan;
       this.donhangs = donhangs;
    }
   
    public Integer getMaNv() {
        return this.maNv;
    }
    
    public void setMaNv(Integer maNv) {
        this.maNv = maNv;
    }
    public String getTenNv() {
        return this.tenNv;
    }
    
    public void setTenNv(String tenNv) {
        this.tenNv = tenNv;
    }
    public Date getNgaySinh() {
        return this.ngaySinh;
    }
    
    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    public String getGioiTinh() {
        return this.gioiTinh;
    }
    
    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    public String getSdt() {
        return this.sdt;
    }
    
    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
    public String getChucVu() {
        return this.chucVu;
    }
    
    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }
    public String getQueQuan() {
        return this.queQuan;
    }
    
    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }
    public Set<Donhang> getDonhangs() {
        return this.donhangs;
    }
    
    public void setDonhangs(Set<Donhang> donhangs) {
        this.donhangs = donhangs;
    }




}


