package Domain;
// Generated Nov 11, 2017 4:10:56 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Sanpham generated by hbm2java
 */
public class Sanpham  implements java.io.Serializable {


     private String maSp;
     private Loaisp loaisp;
     private String tenSp;
     private Long giaSp;
     private String anhSp;
     private String motaSp;
     private Boolean trangThai;
     private Set<Comment> comments = new HashSet<Comment>(0);
     private Set<Chitietdonhang> chitietdonhangs = new HashSet<Chitietdonhang>(0);

    public Sanpham() {
    }

	
    public Sanpham(String maSp) {
        this.maSp = maSp;
    }
    public Sanpham(String maSp, Loaisp loaisp, String tenSp, Long giaSp, String anhSp, String motaSp, Boolean trangThai, Set<Comment> comments, Set<Chitietdonhang> chitietdonhangs) {
       this.maSp = maSp;
       this.loaisp = loaisp;
       this.tenSp = tenSp;
       this.giaSp = giaSp;
       this.anhSp = anhSp;
       this.motaSp = motaSp;
       this.trangThai = trangThai;
       this.comments = comments;
       this.chitietdonhangs = chitietdonhangs;
    }
   
    public String getMaSp() {
        return this.maSp;
    }
    
    public void setMaSp(String maSp) {
        this.maSp = maSp;
    }
    public Loaisp getLoaisp() {
        return this.loaisp;
    }
    
    public void setLoaisp(Loaisp loaisp) {
        this.loaisp = loaisp;
    }
    public String getTenSp() {
        return this.tenSp;
    }
    
    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }
    public Long getGiaSp() {
        return this.giaSp;
    }
    
    public void setGiaSp(Long giaSp) {
        this.giaSp = giaSp;
    }
    public String getAnhSp() {
        return this.anhSp;
    }
    
    public void setAnhSp(String anhSp) {
        this.anhSp = anhSp;
    }
    public String getMotaSp() {
        return this.motaSp;
    }
    
    public void setMotaSp(String motaSp) {
        this.motaSp = motaSp;
    }
    public Boolean getTrangThai() {
        return this.trangThai;
    }
    
    public void setTrangThai(Boolean trangThai) {
        this.trangThai = trangThai;
    }
    public Set<Comment> getComments() {
        return this.comments;
    }
    
    public void setComments(Set<Comment> comments) {
        this.comments = comments;
    }
    public Set<Chitietdonhang> getChitietdonhangs() {
        return this.chitietdonhangs;
    }
    
    public void setChitietdonhangs(Set<Chitietdonhang> chitietdonhangs) {
        this.chitietdonhangs = chitietdonhangs;
    }




}


