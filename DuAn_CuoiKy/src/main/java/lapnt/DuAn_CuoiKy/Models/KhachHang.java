package lapnt.DuAn_CuoiKy.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="khachhang")
public class KhachHang {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IDKH")    
	private int id;        
	@Column(name="HoTenKH" )
	private String hoTen;
	@Column(name="DiaChiKH" )
	private String diaChi;
	@Column(name="EmailKH" )
	private String email;
	@Column(name="SDTKH" )
	private String sdt;
	
	public int getMaKH() {
		return id;
	}
	public void setMaKH(int maKH) {
		this.id = maKH;
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
                "id=" + id +
                ", name='" + hoTen + '\'' +
                ", address='" + diaChi + '\'' +
                ", email='" + email + '\'' +
                ", sdt='" + sdt + '\'' +
                '}';
    }
}
