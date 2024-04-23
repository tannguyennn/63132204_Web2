package lapnt.DuAn.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="sanpham")
public class SanPham {
	@Id
	@Column(name = "IDSP")    
	private String maSP;  
	@Column(name = "TenSP")    
	private String tenSP;
	@Column(name = "MoTa")    
	private String moTa;  
	@Column(name="Gia" )
	private double gia;
	
	public String getMaSP() {
		return maSP;
	}
	public void setMaSP(String maSP) {
		this.maSP = maSP;
	}
	public String getTenSP() {
		return tenSP;
	}
	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	public double getGia() {
		return gia;
	}
	public void setGia(double giatien) {
		gia = giatien;
	}
	
}
