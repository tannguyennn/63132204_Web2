package lapnt.DuAn.Models;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;


@Entity
@Table(name = "hoadon")
public class HoaDon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idhd")
    private int idhd;

    @Column(name = "idkh")
    private int idkh;

    @Column(name = "idnv")
    private int idnv;

	@Column(name = "tonghd")
    private double tonghd;

    @Column(name = "ngaygd")
    private Date ngaygd;

 // Getters and Setters
	public int getIdhd() {
		return idhd;
	}

	public void setIdhd(int idhd) {
		this.idhd = idhd;
	}

	public int getIdkh() {
		return idkh;
	}

	public void setIdkh(int idkh) {
		this.idkh = idkh;
	}
	
    public int getIdnv() {
		return idnv;
	}

	public void setIdnv(int idnv) {
		this.idnv = idnv;
	}

	public double getTonghd() {
		return tonghd;
	}

	public void setTonghd(double tonghd) {
		this.tonghd = tonghd;
	}

	public Date getNgaygd() {
		return ngaygd;
	}

	public void setNgaygd(Date ngaygd) {
		this.ngaygd = ngaygd;
	}

    
    
}
