package lapnt.DuAn_CuoiKy.Models;

import java.math.BigDecimal;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table(name = "HoaDon")
public class HoaDon {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDHD")
    private int id;

    @ManyToOne
    @JoinColumn(name = "IDKH")
    private KhachHang khachHang;

    @Column(name = "TongHD")
    private BigDecimal tongHD;

    @Column(name = "NgayGD")
    private Date ngayGD;

    // Constructors, getters, and setters
}