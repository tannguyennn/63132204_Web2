package lapnt.DuAn.Controllers;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lapnt.DuAn.Models.CTHDDichVu;
import lapnt.DuAn.Models.CTHDSanPham;
import lapnt.DuAn.Models.DichVu;
import lapnt.DuAn.Models.HoaDon;
import lapnt.DuAn.Models.KhachHang;
import lapnt.DuAn.Models.NhanVien;
import lapnt.DuAn.Models.SanPham;
import lapnt.DuAn.Models.ThuCung;
import lapnt.DuAn.Services.CTHDDichVuService;
import lapnt.DuAn.Services.CTHDSanPhamService;
import lapnt.DuAn.Services.DichVuService;
import lapnt.DuAn.Services.HoaDonService;
import lapnt.DuAn.Services.KhachHangService;
import lapnt.DuAn.Services.NhanVienService;
import lapnt.DuAn.Services.SanPhamService;
import lapnt.DuAn.Services.ThuCungService;

@Controller
public class HomeController {
	@Autowired
    private HoaDonService hoaDonService;
    @Autowired
    private SanPhamService sanPhamService;
    @Autowired
    private DichVuService dichVuService;
    @Autowired
    private KhachHangService khachHangService;
    @Autowired
    private NhanVienService nhanVienService;
    @Autowired
    private CTHDDichVuService cthdDichVuService;
    @Autowired
    private CTHDSanPhamService cthdSanPhamService;
    @Autowired
    private ThuCungService thuCungService;
    
	@GetMapping("/")
	public String TrangChu() {
		return "index";
	}
	
	@GetMapping("/thongke")
    public String getInvoices(@RequestParam(name = "start-date", required = false)
                                  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate startDate,
                              @RequestParam(name = "end-date", required = false)
                                  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate endDate,
                              Model model) {
        List<HoaDon> hoadon;

        if (startDate != null && endDate != null) {
            hoadon = hoaDonService.getHoaDonByDateRange(startDate, endDate);
        } else {
            hoadon = hoaDonService.getAllHoaDon();
        }

        double tongTienHD=0;
        for (HoaDon hd : hoadon) {
        	tongTienHD = tongTienHD + hd.getTonghd();
        }
        int tongSLHD = hoaDonService.countTongHD(hoadon);

        model.addAttribute("hoaDons", hoadon);
        model.addAttribute("tongTien", tongTienHD);
        model.addAttribute("tongSL", tongSLHD);

        return "thongke";
    }
	
	public List<SanPham> lsSP = new ArrayList<SanPham>();
	public List<DichVu> lsDV =  new ArrayList<DichVu>();
	public LocalDate ngd = LocalDate.now();
	KhachHang khachHang = new KhachHang();
	List<ThuCung> lsTC = new ArrayList<ThuCung>();
	
	@GetMapping("/hoadonkhachhang/{id}")
	public String HoaDonKhachHang(@PathVariable("id") int idkh,Model model) {
		khachHang = khachHangService.getKhachHangById(idkh);
		List<NhanVien> listNhanVien = nhanVienService.getAllNhanVien();
        
        List<ThuCung> listThuCung = thuCungService.getAllThuCung();
        for( ThuCung tc: listThuCung)
        	if(tc.getKhachHang().getIdkh() == idkh)
        		lsTC.add(tc);
        if(!lsTC.isEmpty())
    		model.addAttribute("lsDV",lsDV);
        model.addAttribute("listThuCung", lsTC);	
        model.addAttribute("ngayGiaoDich", ngd);
		model.addAttribute("khachhang", khachHang);
        model.addAttribute("listNhanVien", listNhanVien);
		model.addAttribute("lsSP",lsSP);

		
		return "hoadon";
	}
	
	@PostMapping("/hoadonkhachhang/save")
	public String saveHoaDon(@ModelAttribute("hoaDon") HoaDon hoaDon,
							@ModelAttribute("cthdDichVu") CTHDDichVu cthdDichVu,
							@ModelAttribute("cthdSanPham") CTHDSanPham cthdSanPham,
							@RequestParam(name = "soLuong") int soLuong) {
		double tongTien=0;
		for (SanPham sp : lsSP) {
			double tong = sp.getGia() * soLuong;
			tongTien = tongTien + tong;
		}
		
		if(!lsTC.isEmpty())
		{
			for (DichVu dv : lsDV) {
				tongTien = tongTien + dv.getGia();
			}
		}
		 
		Date ngaygd = Date.valueOf(ngd);
		hoaDon.setNgaygd(ngaygd);
		hoaDon.setTonghd(tongTien);
		hoaDon.setKhachHang(khachHang);
        hoaDonService.saveHoaDon(hoaDon);
        
        cthdSanPham.setHoaDon(hoaDon);
		for (SanPham sp : lsSP) {
			cthdSanPham.setSoluong(soLuong);
			double tong = sp.getGia() * cthdSanPham.getSoluong();
			cthdSanPham.setSanPham(sp);
			cthdSanPham.setTong(tong);
			cthdSanPhamService.saveCTHDSanPham(cthdSanPham);
		}
		
		if(!lsTC.isEmpty())
		{
			cthdDichVu.setHoaDon(hoaDon);
			for (DichVu dv : lsDV) {
				cthdDichVu.setDichVu(dv);
				cthdDichVu.setTong(dv.getGia());
				cthdDichVuService.saveCTHDDichVu(cthdDichVu);
			}
		}
		
		
		lsDV.clear();
		lsSP.clear();
		lsTC.clear();
		
        return "redirect:/thongke";
        
    } 
	
	@GetMapping("/hoadonSP/{id}")
    public String selectSanPham(@PathVariable("id") int id) {
    	lsSP.add(sanPhamService.getSanPhamById(id));
    	return "redirect:/sanpham";
    }

	@GetMapping("/hoadonDV/{id}")
    public String selectDichVu(@PathVariable("id") int id) {
    	lsDV.add(dichVuService.getDichVuById(id));
    	return "redirect:/dichvu";
    }

	
	
	//chi tiết hóa đơn
	@GetMapping("/cthd/{id}")
    public String cthd(@PathVariable("id") int idhd, Model model) {
		List<CTHDDichVu> lsDV = cthdDichVuService.getAllCTHDDichVu();
		List<CTHDSanPham> lsSP = cthdSanPhamService.getAllCTHDSanPham();
		List<CTHDDichVu> cthdDichVuList = new ArrayList<CTHDDichVu>();
		List<CTHDSanPham> cthdSanPhamList = new ArrayList<CTHDSanPham>();

		for(CTHDDichVu dv : lsDV)
			if(dv.getHoaDon().getIdhd() == idhd)
				cthdDichVuList.add(dv);
		for(CTHDSanPham sp: lsSP)
			if(sp.getHoaDon().getIdhd() == idhd)
				cthdSanPhamList.add(sp);
		
        model.addAttribute("cthdDichVuList", cthdDichVuList);
        model.addAttribute("cthdSanPhamList", cthdSanPhamList);
    	return "cthd";
    }
	
	
	
}
