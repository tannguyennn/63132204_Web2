package lapnt.DuAn.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="dichvu")
public class DichVu {
	@Id
	@Column(name = "IDDV")    
	private String maDV;  
	@Column(name = "TenDV")    
	private String tenDV;
	@Column(name = "MoTa")    
	private String moTa;  
	@Column(name="Gia" )
	private double Gia;
	
	public String getMaDV() {
		return maDV;
	}
	public void setMaDV(String maDV) {
		this.maDV = maDV;
	}
	public String getTenDV() {
		return tenDV;
	}
	public void setTenDV(String tenDV) {
		this.tenDV = tenDV;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	public double getGia() {
		return Gia;
	}
	public void setGia(float gia) {
		Gia = gia;
	}

}
