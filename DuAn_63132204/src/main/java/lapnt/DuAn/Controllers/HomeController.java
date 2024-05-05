package lapnt.DuAn.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/")
	public String TrangChu() {
		return "index";
	}
	
	SanPhamController sp = new SanPhamController();
	DichVuController dv = new DichVuController();
	
	@GetMapping("/hoadonkhachhang")
	public String HoaDonKhachHang(Model model) {
		model.addAttribute("lsSP",sp.getLsSP());
		model.addAttribute("lsDV",dv.getLsDV());
		return "hoadon";
	}
	
}
