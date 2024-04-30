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
@Table(name = "CTHDDV")
public class CTHDDichVu {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDCTHD")
    private int id;

    @ManyToOne
    @JoinColumn(name = "IDHD")
    private HoaDon hoaDon;

    @ManyToOne
    @JoinColumn(name = "IDDV")
    private DichVu dichVu;

    @ManyToOne
    @JoinColumn(name = "IDPet")
    private ThuCung thuCung;

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

	public DichVu getDichVu() {
		return dichVu;
	}

	public void setDichVu(DichVu dichVu) {
		this.dichVu = dichVu;
	}

	public ThuCung getThuCung() {
		return thuCung;
	}

	public void setThuCung(ThuCung thuCung) {
		this.thuCung = thuCung;
	}

	public BigDecimal getTong() {
		return tong;
	}

	public void setTong(BigDecimal tong) {
		this.tong = tong;
	}

   
    
    
}