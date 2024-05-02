package lapnt.DuAn.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "cthddichvu")
public class CTHDDichVu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcthd")
    private int idcthd;

    @Column(name = "idhd")
    private int idhd;

    @Column(name = "iddv")
    private int iddv;

    @Column(name = "idpet")
    private int idpet;

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

	public int getIddv() {
		return iddv;
	}

	public void setIddv(int iddv) {
		this.iddv = iddv;
	}

	public int getIdpet() {
		return idpet;
	}

	public void setIdpet(int idpet) {
		this.idpet = idpet;
	}

	public double getTong() {
		return tong;
	}

	public void setTong(double tong) {
		this.tong = tong;
	}


    
}
