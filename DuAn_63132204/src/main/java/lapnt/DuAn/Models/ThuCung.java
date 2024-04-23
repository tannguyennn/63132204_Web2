package lapnt.DuAn.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="thucung")
public class ThuCung {
	@Id
	@Column(name = "IDPet")    
	private String maPet;        
	@Column(name="TenPet" )
	private String tenPet;
	@Column(name="Loai" )
	private String loai;
	@Column(name="IDKH" )
	private String maKH;
	@Column(name="TinhTrang" )
	private String tinhTrang;
	public String getMaPet() {
		return maPet;
	}
	public void setMaPet(String maPet) {
		this.maPet = maPet;
	}
	public String getTenPet() {
		return tenPet;
	}
	public void setTenPet(String tenPet) {
		this.tenPet = tenPet;
	}
	public String getLoai() {
		return loai;
	}
	public void setLoai(String loai) {
		this.loai = loai;
	}
	public String getMaKH() {
		return maKH;
	}
	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}
	public String getTinhTrang() {
		return tinhTrang;
	}
	public void setTinhTrang(String tinhTrang) {
		this.tinhTrang = tinhTrang;
	}
	
}
