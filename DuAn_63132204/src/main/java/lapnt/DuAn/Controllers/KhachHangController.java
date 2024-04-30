package lapnt.DuAn.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lapnt.DuAn.Models.KhachHang;
import lapnt.DuAn.Services.KhachHangService;

@Controller
@RequestMapping("/khachhang")
public class KhachHangController {
	@Autowired KhachHangService kHService;
	@GetMapping("/ds")
	public String getAll(Model model) {
		List<KhachHang> dsKH = kHService.getAllKhachHang();
		model.addAttribute("dsKhachHang", dsKH);
		return "danhsachKH";
	}
}
