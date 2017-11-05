package Domain;
// Generated Nov 5, 2017 11:17:51 PM by Hibernate Tools 4.3.1



/**
 * Comment generated by hbm2java
 */
public class Comment  implements java.io.Serializable {


     private Integer id;
     private Sanpham sanpham;
     private Taikhoan taikhoan;
     private String nhanXet;

    public Comment() {
    }

	
    public Comment(Sanpham sanpham, Taikhoan taikhoan) {
        this.sanpham = sanpham;
        this.taikhoan = taikhoan;
    }
    public Comment(Sanpham sanpham, Taikhoan taikhoan, String nhanXet) {
       this.sanpham = sanpham;
       this.taikhoan = taikhoan;
       this.nhanXet = nhanXet;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Sanpham getSanpham() {
        return this.sanpham;
    }
    
    public void setSanpham(Sanpham sanpham) {
        this.sanpham = sanpham;
    }
    public Taikhoan getTaikhoan() {
        return this.taikhoan;
    }
    
    public void setTaikhoan(Taikhoan taikhoan) {
        this.taikhoan = taikhoan;
    }
    public String getNhanXet() {
        return this.nhanXet;
    }
    
    public void setNhanXet(String nhanXet) {
        this.nhanXet = nhanXet;
    }




}


