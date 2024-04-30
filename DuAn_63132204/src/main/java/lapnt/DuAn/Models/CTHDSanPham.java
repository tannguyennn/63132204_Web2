package lapnt.DuAn.Models;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "CTHDSP")
public class CTHDSanPham {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDCTHD")
    private int id;

    @ManyToOne
    @JoinColumn(name = "IDHD")
    private HoaDon hoaDon;

    @ManyToOne
    @JoinColumn(name = "IDSP")
    private SanPham sanPham;

    @Column(name = "SoLuong")
    private int soLuong;

    @Column(name = "Tong")
    private BigDecimal tong;
 // Constructors, getters, and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public HoaDon getHoaDon() {
		return hoaDon;
	}

	public void setHoaDon(HoaDon hoaDon) {
		this.hoaDon = hoaDon;
	}

	public SanPham getSanPham() {
		return sanPham;
	}

	public void setSanPham(SanPham sanPham) {
		this.sanPham = sanPham;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public BigDecimal getTong() {
		return tong;
	}

	public void setTong(BigDecimal tong) {
		this.tong = tong;
	}

    
    
}
