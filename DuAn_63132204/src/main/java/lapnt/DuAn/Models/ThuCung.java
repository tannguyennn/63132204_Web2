package lapnt.DuAn.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "thucung")
public class ThuCung {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpet")
    private int idpet;

    @Column(name = "tenpet")
    private String tenpet;

    @Column(name = "loai")
    private String loai;

    @Column(name = "idkh")
    private int idkh;

    @Column(name = "tinhtrang")
    private String tinhtrang;
    
 // Getters and Setters
	public int getIdpet() {
		return idpet;
	}

	public void setIdpet(int idpet) {
		this.idpet = idpet;
	}

	public String getTenpet() {
		return tenpet;
	}

	public void setTenpet(String tenpet) {
		this.tenpet = tenpet;
	}

	public String getLoai() {
		return loai;
	}

	public void setLoai(String loai) {
		this.loai = loai;
	}

	public int getIdkh() {
		return idkh;
	}

	public void setIdkh(int idkh) {
		this.idkh = idkh;
	}

	public String getTinhtrang() {
		return tinhtrang;
	}

	public void setTinhtrang(String tinhtrang) {
		this.tinhtrang = tinhtrang;
	}

    
    
}
