package lapnt.DuAn_CuoiKy.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lapnt.DuAn_CuoiKy.Models.KhachHang;
import lapnt.DuAn.Services.KhachHangService;

@Controller
public class KhachHangController {
	@Autowired KhachHangService kHService;
	@GetMapping("/dsKH")
	public String getAll(Model model) {
		List<KhachHang> dsKH = kHService.getAllKhachHang();
		model.addAttribute("dsKhachHang", dsKH);
		return "danhsachKH";
	}
}

