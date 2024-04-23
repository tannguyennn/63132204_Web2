package lapnt.DuAn.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="cthddichvu")
public class CTHDDichVu {
	@Id
	@Column(name = "IDCTHD")    
	private String maCTHD;        
	@Column(name="IDHD" )
	private String maHD;
	@Column(name="IDDV" )
	private String maDV;
	@Column(name="IDPet" )
	private String maPet;
	@Column(name="Tong" )
	private double giaTien;
	public String getMaCTHD() {
		return maCTHD;
	}
	public void setMaCTHD(String maCTHD) {
		this.maCTHD = maCTHD;
	}
	public String getMaHD() {
		return maHD;
	}
	public void setMaHD(String maHD) {
		this.maHD = maHD;
	}
	public String getMaDV() {
		return maDV;
	}
	public void setMaDV(String maDV) {
		this.maDV = maDV;
	}
	public String getMaPet() {
		return maPet;
	}
	public void setMaPet(String maPet) {
		this.maPet = maPet;
	}
	public double getGiaTien() {
		return giaTien;
	}
	public void setGiaTien(double giaTien) {
		this.giaTien = giaTien;
	}
	
	
}
