package lapnt.DuAn.Models;

import jakarta.persistence.*;

@Entity
@Table (name="khachhang")
public class KhachHang {
	@Id
	@Column(name = "IDKH")    
	private String maKH;        
	@Column(name="HoTenKH" )
	private String hoTen;
	@Column(name="DiaChiKH" )
	private String diaChi;
	@Column(name="EmailKH" )
	private String email;
	@Column(name="SDTKH" )
	private String sdt;
	
	public String getMaKH() {
		return maKH;
	}
	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	
	@Override
    public String toString() {
        return "Customer{" +
                "id=" + maKH +
                ", name='" + hoTen + '\'' +
                ", address='" + diaChi + '\'' +
                ", email='" + email + '\'' +
                ", sdt='" + sdt + '\'' +
                '}';
    }
}
