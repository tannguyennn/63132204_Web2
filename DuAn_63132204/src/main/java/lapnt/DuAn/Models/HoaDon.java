package lapnt.DuAn.Models;

import javax.xml.crypto.Data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="hoadon")
public class HoaDon {
	@Id
	@Column(name = "IDHD")    
	private String maHD;  
	@Column(name = "IDKH")    
	private String maKH;
	@Column(name = "IDNV")    
	private String maNV;  
	@Column(name="TongHD" )
	private double tongHD;
	@Column(name="NgayGD" )
	private Data ngayGD;
	
	public String getMaHD() {
		return maHD;
	}
	public void setMaHD(String maHD) {
		this.maHD = maHD;
	}
	public String getMaKH() {
		return maKH;
	}
	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}
	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	public double getTongHD() {
		return tongHD;
	}
	public void setTongHD(float tongHD) {
		this.tongHD = tongHD;
	}
	public Data getNgayGD() {
		return ngayGD;
	}
	public void setNgayGD(Data ngayGD) {
		this.ngayGD = ngayGD;
	}

	
}
