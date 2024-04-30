package lapnt.DuAn.Models;

import java.math.BigDecimal;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table(name = "HoaDon")
public class HoaDon {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDHD")
    private int id;

    @ManyToOne
    @JoinColumn(name = "IDKH")
    private KhachHang khachHang;

    @Column(name = "TongHD")
    private BigDecimal tongHD;

    @Column(name = "NgayGD")
    private Date ngayGD;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public KhachHang getKhachHang() {
		return khachHang;
	}

	public void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}

	public BigDecimal getTongHD() {
		return tongHD;
	}

	public void setTongHD(BigDecimal tongHD) {
		this.tongHD = tongHD;
	}

	public Date getNgayGD() {
		return ngayGD;
	}

	public void setNgayGD(Date ngayGD) {
		this.ngayGD = ngayGD;
	}

    // Constructors, getters, and setters
    
}