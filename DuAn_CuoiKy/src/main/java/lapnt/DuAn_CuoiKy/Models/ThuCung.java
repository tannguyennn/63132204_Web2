package lapnt.DuAn_CuoiKy.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ThuCung")
public class ThuCung {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDPet")
    private int id;

    @Column(name = "TenPet")
    private String tenPet;

    @Column(name = "Loai")
    private String loai;

    @ManyToOne
    @JoinColumn(name = "IDKH")
    private KhachHang khachHang;

    @Column(name = "TinhTrang")
    private String tinhTrang;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public KhachHang getKhachHang() {
		return khachHang;
	}

	public void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}

	public String getTinhTrang() {
		return tinhTrang;
	}

	public void setTinhTrang(String tinhTrang) {
		this.tinhTrang = tinhTrang;
	}

    // Constructors, getters, and setters
    
    
}
