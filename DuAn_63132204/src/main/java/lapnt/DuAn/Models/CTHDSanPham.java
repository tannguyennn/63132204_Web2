package lapnt.DuAn.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;


@Entity
@Table(name = "cthdsanpham")
public class CTHDSanPham {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcthd")
    private int idcthd;

    @Column(name = "idhd")
    private int idhd;

    @Column(name = "idsp")
    private int idsp;

    @Column(name = "soluong")
    private int soluong;

    @Column(name = "tong")
    private double tong;
 // Getters and Setters
	public int getIdcthd() {
		return idcthd;
	}

	public void setIdcthd(int idcthd) {
		this.idcthd = idcthd;
	}

	public int getIdhd() {
		return idhd;
	}

	public void setIdhd(int idhd) {
		this.idhd = idhd;
	}

	public int getIdsp() {
		return idsp;
	}

	public void setIdsp(int idsp) {
		this.idsp = idsp;
	}

	public int getSoluong() {
		return soluong;
	}

	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}

	public double getTong() {
		return tong;
	}

	public void setTong(double tong) {
		this.tong = tong;
	}

    
    
}
